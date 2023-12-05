<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.FlightNumberTBXT = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.departureTimeDTP = New System.Windows.Forms.DateTimePicker()
        Me.departureDayDTP = New System.Windows.Forms.DateTimePicker()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.arrivalTimeDTP = New System.Windows.Forms.DateTimePicker()
        Me.arrivalDayDTP = New System.Windows.Forms.DateTimePicker()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.TimesforFlightLBL = New System.Windows.Forms.Label()
        Me.FlightDurationLBL = New System.Windows.Forms.Label()
        Me.TUDHLBL = New System.Windows.Forms.Label()
        Me.TUDDLBL = New System.Windows.Forms.Label()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Calculate_TimesBTN = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.SuspendLayout()
        '
        'FlightNumberTBXT
        '
        Me.FlightNumberTBXT.Location = New System.Drawing.Point(223, 22)
        Me.FlightNumberTBXT.Name = "FlightNumberTBXT"
        Me.FlightNumberTBXT.Size = New System.Drawing.Size(100, 22)
        Me.FlightNumberTBXT.TabIndex = 0
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(23, 22)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(127, 22)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Flight Number:"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.Label3)
        Me.GroupBox1.Controls.Add(Me.Label2)
        Me.GroupBox1.Controls.Add(Me.departureTimeDTP)
        Me.GroupBox1.Controls.Add(Me.departureDayDTP)
        Me.GroupBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(17, 87)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(312, 160)
        Me.GroupBox1.TabIndex = 2
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Departure Information"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(6, 111)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(55, 22)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "Time:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(6, 57)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(47, 22)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Day:"
        '
        'departureTimeDTP
        '
        Me.departureTimeDTP.Format = System.Windows.Forms.DateTimePickerFormat.Time
        Me.departureTimeDTP.Location = New System.Drawing.Point(106, 106)
        Me.departureTimeDTP.Name = "departureTimeDTP"
        Me.departureTimeDTP.ShowUpDown = True
        Me.departureTimeDTP.Size = New System.Drawing.Size(200, 28)
        Me.departureTimeDTP.TabIndex = 1
        Me.departureTimeDTP.Value = New Date(2023, 2, 23, 18, 30, 0, 0)
        '
        'departureDayDTP
        '
        Me.departureDayDTP.CustomFormat = "MM/dd/yyyy"
        Me.departureDayDTP.Location = New System.Drawing.Point(106, 57)
        Me.departureDayDTP.Name = "departureDayDTP"
        Me.departureDayDTP.Size = New System.Drawing.Size(200, 28)
        Me.departureDayDTP.TabIndex = 0
        Me.departureDayDTP.Value = New Date(2023, 2, 9, 0, 0, 0, 0)
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.Label5)
        Me.GroupBox2.Controls.Add(Me.Label4)
        Me.GroupBox2.Controls.Add(Me.arrivalTimeDTP)
        Me.GroupBox2.Controls.Add(Me.arrivalDayDTP)
        Me.GroupBox2.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox2.Location = New System.Drawing.Point(10, 281)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(319, 157)
        Me.GroupBox2.TabIndex = 3
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Arrival Information"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(13, 107)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(55, 22)
        Me.Label5.TabIndex = 3
        Me.Label5.Text = "Time:"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(13, 44)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(47, 22)
        Me.Label4.TabIndex = 2
        Me.Label4.Text = "Day:"
        '
        'arrivalTimeDTP
        '
        Me.arrivalTimeDTP.CustomFormat = ""
        Me.arrivalTimeDTP.Format = System.Windows.Forms.DateTimePickerFormat.Time
        Me.arrivalTimeDTP.Location = New System.Drawing.Point(113, 107)
        Me.arrivalTimeDTP.Name = "arrivalTimeDTP"
        Me.arrivalTimeDTP.ShowUpDown = True
        Me.arrivalTimeDTP.Size = New System.Drawing.Size(200, 28)
        Me.arrivalTimeDTP.TabIndex = 1
        Me.arrivalTimeDTP.Value = New Date(2023, 2, 23, 18, 30, 0, 0)
        '
        'arrivalDayDTP
        '
        Me.arrivalDayDTP.Location = New System.Drawing.Point(113, 44)
        Me.arrivalDayDTP.Name = "arrivalDayDTP"
        Me.arrivalDayDTP.Size = New System.Drawing.Size(200, 28)
        Me.arrivalDayDTP.TabIndex = 0
        Me.arrivalDayDTP.Value = New Date(2023, 2, 9, 0, 0, 0, 0)
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.TimesforFlightLBL)
        Me.GroupBox3.Controls.Add(Me.FlightDurationLBL)
        Me.GroupBox3.Controls.Add(Me.TUDHLBL)
        Me.GroupBox3.Controls.Add(Me.TUDDLBL)
        Me.GroupBox3.Controls.Add(Me.Label9)
        Me.GroupBox3.Controls.Add(Me.Label8)
        Me.GroupBox3.Controls.Add(Me.Label7)
        Me.GroupBox3.Controls.Add(Me.Label6)
        Me.GroupBox3.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox3.Location = New System.Drawing.Point(435, 22)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(312, 359)
        Me.GroupBox3.TabIndex = 4
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Times for Flight"
        '
        'TimesforFlightLBL
        '
        Me.TimesforFlightLBL.AutoSize = True
        Me.TimesforFlightLBL.Location = New System.Drawing.Point(148, 0)
        Me.TimesforFlightLBL.Name = "TimesforFlightLBL"
        Me.TimesforFlightLBL.Size = New System.Drawing.Size(52, 22)
        Me.TimesforFlightLBL.TabIndex = 7
        Me.TimesforFlightLBL.Text = "-N/A-"
        '
        'FlightDurationLBL
        '
        Me.FlightDurationLBL.AutoSize = True
        Me.FlightDurationLBL.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.FlightDurationLBL.Location = New System.Drawing.Point(22, 295)
        Me.FlightDurationLBL.MaximumSize = New System.Drawing.Size(500, 500)
        Me.FlightDurationLBL.MinimumSize = New System.Drawing.Size(200, 30)
        Me.FlightDurationLBL.Name = "FlightDurationLBL"
        Me.FlightDurationLBL.Size = New System.Drawing.Size(200, 30)
        Me.FlightDurationLBL.TabIndex = 6
        Me.FlightDurationLBL.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'TUDHLBL
        '
        Me.TUDHLBL.AutoSize = True
        Me.TUDHLBL.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.TUDHLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TUDHLBL.ForeColor = System.Drawing.Color.Maroon
        Me.TUDHLBL.Location = New System.Drawing.Point(137, 168)
        Me.TUDHLBL.MaximumSize = New System.Drawing.Size(500, 500)
        Me.TUDHLBL.MinimumSize = New System.Drawing.Size(80, 30)
        Me.TUDHLBL.Name = "TUDHLBL"
        Me.TUDHLBL.Size = New System.Drawing.Size(80, 30)
        Me.TUDHLBL.TabIndex = 5
        Me.TUDHLBL.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'TUDDLBL
        '
        Me.TUDDLBL.AutoSize = True
        Me.TUDDLBL.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.TUDDLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.TUDDLBL.ForeColor = System.Drawing.Color.Maroon
        Me.TUDDLBL.Location = New System.Drawing.Point(137, 100)
        Me.TUDDLBL.MaximumSize = New System.Drawing.Size(500, 500)
        Me.TUDDLBL.MinimumSize = New System.Drawing.Size(80, 30)
        Me.TUDDLBL.Name = "TUDDLBL"
        Me.TUDDLBL.Size = New System.Drawing.Size(80, 30)
        Me.TUDDLBL.TabIndex = 4
        Me.TUDDLBL.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(18, 244)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(132, 22)
        Me.Label9.TabIndex = 3
        Me.Label9.Text = "Flight Duration:"
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(18, 51)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(178, 22)
        Me.Label8.TabIndex = 2
        Me.Label8.Text = "Time until Departure:"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(18, 171)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(63, 22)
        Me.Label7.TabIndex = 1
        Me.Label7.Text = "Hours:"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(18, 100)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(56, 22)
        Me.Label6.TabIndex = 0
        Me.Label6.Text = "Days:"
        '
        'Calculate_TimesBTN
        '
        Me.Calculate_TimesBTN.Font = New System.Drawing.Font("Microsoft Sans Serif", 10.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Calculate_TimesBTN.Location = New System.Drawing.Point(519, 387)
        Me.Calculate_TimesBTN.Name = "Calculate_TimesBTN"
        Me.Calculate_TimesBTN.Size = New System.Drawing.Size(228, 57)
        Me.Calculate_TimesBTN.TabIndex = 5
        Me.Calculate_TimesBTN.Text = "Calculate Times"
        Me.Calculate_TimesBTN.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Calculate_TimesBTN)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.FlightNumberTBXT)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents FlightNumberTBXT As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents departureTimeDTP As DateTimePicker
    Friend WithEvents departureDayDTP As DateTimePicker
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents arrivalTimeDTP As DateTimePicker
    Friend WithEvents arrivalDayDTP As DateTimePicker
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents TimesforFlightLBL As Label
    Friend WithEvents FlightDurationLBL As Label
    Friend WithEvents TUDHLBL As Label
    Friend WithEvents TUDDLBL As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents Label8 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents Calculate_TimesBTN As Button
End Class
