Option Strict On
Public Class AlarmTimerFRM
    Private setTime As Date
    Private setAlarm As Boolean = False

    Private Sub AlarmTimerFRM_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        outCurrentTimeLBL.Text = Date.Now.ToLongTimeString
        outCurrentTimeLBL.BackColor = Color.LightGray
        setTimerDTP.Value = New DateTime(1900, 1, 1, 0, 0, 0) 'set timer duration to zero
        resetBTN.Enabled = False
        mainTMR.Start()
    End Sub

    Private Sub setBTN_Click(sender As Object, e As EventArgs) Handles setBTN.Click
        Dim timerDuration As DateTime = setTimerDTP.Value
        Dim currentTime As DateTime = DateTime.Now
        If timerDuration.Hour = 0 And timerDuration.Minute = 0 And timerDuration.Second = 0 Then 'check if timer duration is zero
            MessageBox.Show("Please set a valid timer duration.")
        Else
            'set alarm time
            setTime = currentTime
            setTime = setTime.AddHours(timerDuration.Hour)
            setTime = setTime.AddMinutes(timerDuration.Minute)
            setTime = setTime.AddSeconds(timerDuration.Second)
            setAlarm = True 'make setAlarm flag variable to indicate that alarm has been set
            alarmTimeLBL.Text = setTime.ToLongTimeString()
            setBTN.Enabled = False
            resetBTN.Enabled = True
        End If
    End Sub

    Private Sub mainTMR_Tick(sender As Object, e As EventArgs) Handles mainTMR.Tick
        Dim currentTime As DateTime = DateTime.Now 'get current time
        outCurrentTimeLBL.Text = currentTime.ToLongTimeString 'update current time
        If setAlarm Then 'execute code if alarm is set
            'if alarm time becomes equal to current time
            If currentTime.Year = setTime.Year And currentTime.Month = setTime.Month And currentTime.Day = setTime.Day _
                And currentTime.Hour = setTime.Hour And currentTime.Minute = setTime.Minute And currentTime.Second = setTime.Second Then
                setAlarm = False 
                flashTMR.Start()
                alarmTimeLBL.BackColor = Color.Yellow
                Beep()
            End If
            'update timer duration
            Dim timerDuration As New TimeSpan(setTime.Ticks - currentTime.Ticks)
            If currentTime.Millisecond > setTime.Millisecond Then
                timerDuration = timerDuration.Add(New TimeSpan(0, 0, 1)) 'round seconds
            End If
            setTimerDTP.Value = New DateTime(1900, 1, 1, timerDuration.Hours, timerDuration.Minutes, timerDuration.Seconds)
        End If
    End Sub

    Private Sub resetBTN_Click(sender As Object, e As EventArgs) Handles resetBTN.Click
        flashTMR.Stop()
        alarmTimeLBL.Text = ""
        ResetDuration()
    End Sub

    Private Sub ResetDuration()
        setBTN.Enabled = True
        resetBTN.Enabled = False
        setTimerDTP.Value = New DateTime(1900, 1, 1, 0, 0, 0) 'set timer duration to zero
        alarmTimeLBL.BackColor = Color.LightGray
    End Sub

    Private Sub flashTMR_Tick(sender As Object, e As EventArgs) Handles flashTMR.Tick
        If alarmTimeLBL.BackColor = Color.Yellow Then
            alarmTimeLBL.BackColor = Color.LightGray
        ElseIf alarmTimeLBL.BackColor = Color.LightGray Then
            alarmTimeLBL.BackColor = Color.Yellow
        End If
    End Sub
End Class

