<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class AlarmTimerFRM
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
        Me.components = New System.ComponentModel.Container()
        Me.currentLBL = New System.Windows.Forms.Label()
        Me.setTimerLBL = New System.Windows.Forms.Label()
        Me.outCurrentTimeLBL = New System.Windows.Forms.Label()
        Me.targetLBL = New System.Windows.Forms.Label()
        Me.setTimerDTP = New System.Windows.Forms.DateTimePicker()
        Me.alarmTimeLBL = New System.Windows.Forms.Label()
        Me.mainTMR = New System.Windows.Forms.Timer(Me.components)
        Me.flashTMR = New System.Windows.Forms.Timer(Me.components)
        Me.setBTN = New System.Windows.Forms.Button()
        Me.resetBTN = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'currentLBL
        '
        Me.currentLBL.AutoSize = True
        Me.currentLBL.Location = New System.Drawing.Point(13, 20)
        Me.currentLBL.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.currentLBL.Name = "currentLBL"
        Me.currentLBL.Size = New System.Drawing.Size(124, 25)
        Me.currentLBL.TabIndex = 0
        Me.currentLBL.Text = "Current time:"
        '
        'setTimerLBL
        '
        Me.setTimerLBL.AutoSize = True
        Me.setTimerLBL.Location = New System.Drawing.Point(13, 70)
        Me.setTimerLBL.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.setTimerLBL.Name = "setTimerLBL"
        Me.setTimerLBL.Size = New System.Drawing.Size(123, 25)
        Me.setTimerLBL.TabIndex = 1
        Me.setTimerLBL.Text = "Set duration:"
        '
        'outCurrentTimeLBL
        '
        Me.outCurrentTimeLBL.BackColor = System.Drawing.Color.LightGray
        Me.outCurrentTimeLBL.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.outCurrentTimeLBL.Location = New System.Drawing.Point(120, 17)
        Me.outCurrentTimeLBL.Name = "outCurrentTimeLBL"
        Me.outCurrentTimeLBL.Size = New System.Drawing.Size(126, 27)
        Me.outCurrentTimeLBL.TabIndex = 2
        Me.outCurrentTimeLBL.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'targetLBL
        '
        Me.targetLBL.AutoSize = True
        Me.targetLBL.Location = New System.Drawing.Point(17, 115)
        Me.targetLBL.Name = "targetLBL"
        Me.targetLBL.Size = New System.Drawing.Size(110, 25)
        Me.targetLBL.TabIndex = 6
        Me.targetLBL.Text = "Alarm time:"
        '
        'setTimerDTP
        '
        Me.setTimerDTP.CustomFormat = "HH:mm:ss"
        Me.setTimerDTP.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.setTimerDTP.Location = New System.Drawing.Point(120, 64)
        Me.setTimerDTP.Name = "setTimerDTP"
        Me.setTimerDTP.ShowUpDown = True
        Me.setTimerDTP.Size = New System.Drawing.Size(126, 30)
        Me.setTimerDTP.TabIndex = 0
        '
        'alarmTimeLBL
        '
        Me.alarmTimeLBL.BackColor = System.Drawing.Color.LightGray
        Me.alarmTimeLBL.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D
        Me.alarmTimeLBL.Location = New System.Drawing.Point(120, 108)
        Me.alarmTimeLBL.Name = "alarmTimeLBL"
        Me.alarmTimeLBL.Size = New System.Drawing.Size(126, 27)
        Me.alarmTimeLBL.TabIndex = 8
        Me.alarmTimeLBL.TextAlign = System.Drawing.ContentAlignment.MiddleCenter
        '
        'mainTMR
        '
        Me.mainTMR.Interval = 1000
        '
        'flashTMR
        '
        Me.flashTMR.Interval = 150
        '
        'setBTN
        '
        Me.setBTN.Location = New System.Drawing.Point(65, 160)
        Me.setBTN.Name = "setBTN"
        Me.setBTN.Size = New System.Drawing.Size(75, 30)
        Me.setBTN.TabIndex = 1
        Me.setBTN.Text = "Set"
        Me.setBTN.UseVisualStyleBackColor = True
        '
        'resetBTN
        '
        Me.resetBTN.Location = New System.Drawing.Point(146, 160)
        Me.resetBTN.Name = "resetBTN"
        Me.resetBTN.Size = New System.Drawing.Size(75, 30)
        Me.resetBTN.TabIndex = 2
        Me.resetBTN.Text = "Reset"
        Me.resetBTN.UseVisualStyleBackColor = True
        '
        'AlarmTimerFRM
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(12.0!, 25.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(262, 208)
        Me.Controls.Add(Me.resetBTN)
        Me.Controls.Add(Me.setBTN)
        Me.Controls.Add(Me.alarmTimeLBL)
        Me.Controls.Add(Me.setTimerDTP)
        Me.Controls.Add(Me.targetLBL)
        Me.Controls.Add(Me.outCurrentTimeLBL)
        Me.Controls.Add(Me.setTimerLBL)
        Me.Controls.Add(Me.currentLBL)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(4, 5, 4, 5)
        Me.Name = "AlarmTimerFRM"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Timer Alarm"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents currentLBL As Label
    Friend WithEvents setTimerLBL As Label
    Friend WithEvents outCurrentTimeLBL As Label
    Friend WithEvents targetLBL As Label
    Friend WithEvents setTimerDTP As DateTimePicker
    Friend WithEvents alarmTimeLBL As Label
    Friend WithEvents mainTMR As Timer
    Friend WithEvents flashTMR As Timer
    Friend WithEvents setBTN As Button
    Friend WithEvents resetBTN As Button
End Class
