Option Strict On
Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        departureDayDTP.Format = DateTimePickerFormat.Custom
        departureDayDTP.CustomFormat = "MM/dd/yyyy"
        arrivalDayDTP.Format = DateTimePickerFormat.Custom
        arrivalDayDTP.CustomFormat = "MM/dd/yyyy"
        arrivalTimeDTP.Format = DateTimePickerFormat.Custom
        arrivalTimeDTP.CustomFormat = "hh:mm tt"
        departureTimeDTP.Format = DateTimePickerFormat.Custom
        departureTimeDTP.CustomFormat = "hh:mm tt"
        TimesforFlightLBL.Text = "-N/A-"
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Calculate_TimesBTN.Click
        TimesforFlightLBL.Text = FlightNumberTBXT.Text
        'setting arrival DTP to one DateTime'
        Dim arrivalDate As Date = arrivalDayDTP.Value.Date
        Dim arrivalTime As TimeSpan = arrivalTimeDTP.Value.TimeOfDay
        Dim arrivalDateTime As DateTime = arrivalDate.Add(arrivalTime)
        'setting departure DTP to one DateTime'
        Dim departureDate As Date = departureDayDTP.Value.Date
        Dim departureTime As TimeSpan = departureTimeDTP.Value.TimeOfDay
        Dim departureDateTime As DateTime = departureDate.Add(departureTime)
        'Calculating duratiion '
        Dim duration As TimeSpan = arrivalDateTime.Subtract(departureDateTime)
        Dim durationInMinutes As Integer = CInt(duration.TotalMinutes)
        Dim durationInHours As Integer = durationInMinutes \ 60
        Dim remainingMinutes As Integer = durationInMinutes Mod 60
        Dim durationString As String = String.Format("{0} hours, {1} minutes", durationInHours, remainingMinutes)
        FlightDurationLBL.Text = durationString
        'calculating from now till departure time'
        Dim currentTime As DateTime = DateTime.Now
        Dim remainingTime As TimeSpan = departureDateTime.Subtract(currentTime)
        Dim remainingDays As Integer = CInt(Math.Floor(remainingTime.TotalDays))
        Dim remainingHours As Integer = CInt(Math.Floor(remainingTime.TotalHours) Mod 24)
        TUDDLBL.Text = CStr(remainingDays)
        TUDHLBL.Text = CStr(remainingHours)
        If String.IsNullOrEmpty(FlightNumberTBXT.Text) Then
            MessageBox.Show("Please enter a flight number.", "Missing Data")
            Return
        End If
        If departureDateTime <= arrivalDateTime Then
            MessageBox.Show("Departure must be in the future.", "Invalid Departure Date/Time")
            Return
        End If
    End Sub

    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles FlightNumberTBXT.TextChanged
        TimesforFlightLBL.Text = "-N/A-"

    End Sub

    Private Sub departureTimeDTP_ValueChanged(sender As Object, e As EventArgs) Handles departureTimeDTP.ValueChanged
        TUDDLBL.Text = ""
        TUDHLBL.Text = ""
        FlightDurationLBL.Text = ""
    End Sub

    Private Sub arrivalTimeDTP_ValueChanged(sender As Object, e As EventArgs) Handles arrivalTimeDTP.ValueChanged
        TUDDLBL.Text = ""
        TUDHLBL.Text = ""
        FlightDurationLBL.Text = ""
    End Sub

    Private Sub departureDayDTP_ValueChanged(sender As Object, e As EventArgs) Handles departureDayDTP.ValueChanged
        TUDDLBL.Text = ""
        TUDHLBL.Text = ""
        FlightDurationLBL.Text = ""
    End Sub

    Private Sub arrivalDayDTP_ValueChanged(sender As Object, e As EventArgs) Handles arrivalDayDTP.ValueChanged
        TUDDLBL.Text = ""
        TUDHLBL.Text = ""
        FlightDurationLBL.Text = ""
    End Sub

    Private Sub TUDD_Click(sender As Object, e As EventArgs) Handles TUDDLBL.Click

    End Sub
End Class
