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
        Me.newTeamGBX = New System.Windows.Forms.GroupBox()
        Me.leagueLBL = New System.Windows.Forms.Label()
        Me.leagueCBO = New System.Windows.Forms.ComboBox()
        Me.teamNameTBX = New System.Windows.Forms.TextBox()
        Me.teamNameLBL = New System.Windows.Forms.Label()
        Me.playersGBX = New System.Windows.Forms.GroupBox()
        Me.pos4CBX = New System.Windows.Forms.ComboBox()
        Me.pos3CBX = New System.Windows.Forms.ComboBox()
        Me.pos2CBX = New System.Windows.Forms.ComboBox()
        Me.dob4DTP = New System.Windows.Forms.DateTimePicker()
        Me.name4TBX = New System.Windows.Forms.TextBox()
        Me.dob3DTP = New System.Windows.Forms.DateTimePicker()
        Me.name3TBX = New System.Windows.Forms.TextBox()
        Me.dob2DTP = New System.Windows.Forms.DateTimePicker()
        Me.name2TBX = New System.Windows.Forms.TextBox()
        Me.DOB_LBL = New System.Windows.Forms.Label()
        Me.dob1DTP = New System.Windows.Forms.DateTimePicker()
        Me.pos1CBO = New System.Windows.Forms.ComboBox()
        Me.PositionLBL = New System.Windows.Forms.Label()
        Me.name1TBX = New System.Windows.Forms.TextBox()
        Me.nameLBL = New System.Windows.Forms.Label()
        Me.teamToDisplayLBL = New System.Windows.Forms.Label()
        Me.teamLBX = New System.Windows.Forms.ListBox()
        Me.makeTeamBTN = New System.Windows.Forms.Button()
        Me.outTBX = New System.Windows.Forms.TextBox()
        Me.newTeamGBX.SuspendLayout()
        Me.playersGBX.SuspendLayout()
        Me.SuspendLayout()
        '
        'newTeamGBX
        '
        Me.newTeamGBX.Controls.Add(Me.leagueLBL)
        Me.newTeamGBX.Controls.Add(Me.leagueCBO)
        Me.newTeamGBX.Controls.Add(Me.teamNameTBX)
        Me.newTeamGBX.Controls.Add(Me.teamNameLBL)
        Me.newTeamGBX.Location = New System.Drawing.Point(13, 13)
        Me.newTeamGBX.Name = "newTeamGBX"
        Me.newTeamGBX.Size = New System.Drawing.Size(197, 160)
        Me.newTeamGBX.TabIndex = 0
        Me.newTeamGBX.TabStop = False
        Me.newTeamGBX.Text = "New team entry:"
        '
        'leagueLBL
        '
        Me.leagueLBL.AutoSize = True
        Me.leagueLBL.Location = New System.Drawing.Point(7, 88)
        Me.leagueLBL.Name = "leagueLBL"
        Me.leagueLBL.Size = New System.Drawing.Size(123, 24)
        Me.leagueLBL.TabIndex = 3
        Me.leagueLBL.Text = "League level:"
        '
        'leagueCBO
        '
        Me.leagueCBO.FormattingEnabled = True
        Me.leagueCBO.Location = New System.Drawing.Point(10, 112)
        Me.leagueCBO.Name = "leagueCBO"
        Me.leagueCBO.Size = New System.Drawing.Size(165, 32)
        Me.leagueCBO.TabIndex = 2
        '
        'teamNameTBX
        '
        Me.teamNameTBX.Location = New System.Drawing.Point(10, 46)
        Me.teamNameTBX.Name = "teamNameTBX"
        Me.teamNameTBX.Size = New System.Drawing.Size(165, 29)
        Me.teamNameTBX.TabIndex = 1
        '
        'teamNameLBL
        '
        Me.teamNameLBL.AutoSize = True
        Me.teamNameLBL.Location = New System.Drawing.Point(7, 24)
        Me.teamNameLBL.Name = "teamNameLBL"
        Me.teamNameLBL.Size = New System.Drawing.Size(117, 24)
        Me.teamNameLBL.TabIndex = 0
        Me.teamNameLBL.Text = "Team name:"
        '
        'playersGBX
        '
        Me.playersGBX.Controls.Add(Me.pos4CBX)
        Me.playersGBX.Controls.Add(Me.pos3CBX)
        Me.playersGBX.Controls.Add(Me.pos2CBX)
        Me.playersGBX.Controls.Add(Me.dob4DTP)
        Me.playersGBX.Controls.Add(Me.name4TBX)
        Me.playersGBX.Controls.Add(Me.dob3DTP)
        Me.playersGBX.Controls.Add(Me.name3TBX)
        Me.playersGBX.Controls.Add(Me.dob2DTP)
        Me.playersGBX.Controls.Add(Me.name2TBX)
        Me.playersGBX.Controls.Add(Me.DOB_LBL)
        Me.playersGBX.Controls.Add(Me.dob1DTP)
        Me.playersGBX.Controls.Add(Me.pos1CBO)
        Me.playersGBX.Controls.Add(Me.PositionLBL)
        Me.playersGBX.Controls.Add(Me.name1TBX)
        Me.playersGBX.Controls.Add(Me.nameLBL)
        Me.playersGBX.Location = New System.Drawing.Point(240, 13)
        Me.playersGBX.Name = "playersGBX"
        Me.playersGBX.Size = New System.Drawing.Size(479, 210)
        Me.playersGBX.TabIndex = 1
        Me.playersGBX.TabStop = False
        Me.playersGBX.Text = "Team members (4 maximum):"
        '
        'pos4CBX
        '
        Me.pos4CBX.FormattingEnabled = True
        Me.pos4CBX.Location = New System.Drawing.Point(191, 165)
        Me.pos4CBX.Name = "pos4CBX"
        Me.pos4CBX.Size = New System.Drawing.Size(121, 32)
        Me.pos4CBX.TabIndex = 17
        '
        'pos3CBX
        '
        Me.pos3CBX.FormattingEnabled = True
        Me.pos3CBX.Location = New System.Drawing.Point(191, 127)
        Me.pos3CBX.Name = "pos3CBX"
        Me.pos3CBX.Size = New System.Drawing.Size(121, 32)
        Me.pos3CBX.TabIndex = 16
        '
        'pos2CBX
        '
        Me.pos2CBX.FormattingEnabled = True
        Me.pos2CBX.Location = New System.Drawing.Point(192, 85)
        Me.pos2CBX.Name = "pos2CBX"
        Me.pos2CBX.Size = New System.Drawing.Size(121, 32)
        Me.pos2CBX.TabIndex = 15
        '
        'dob4DTP
        '
        Me.dob4DTP.CustomFormat = "d/MM/yyyy"
        Me.dob4DTP.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.dob4DTP.Location = New System.Drawing.Point(341, 168)
        Me.dob4DTP.Name = "dob4DTP"
        Me.dob4DTP.Size = New System.Drawing.Size(124, 29)
        Me.dob4DTP.TabIndex = 14
        '
        'name4TBX
        '
        Me.name4TBX.Location = New System.Drawing.Point(20, 168)
        Me.name4TBX.Name = "name4TBX"
        Me.name4TBX.Size = New System.Drawing.Size(146, 29)
        Me.name4TBX.TabIndex = 12
        '
        'dob3DTP
        '
        Me.dob3DTP.CustomFormat = "d/MM/yyyy"
        Me.dob3DTP.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.dob3DTP.Location = New System.Drawing.Point(341, 127)
        Me.dob3DTP.Name = "dob3DTP"
        Me.dob3DTP.Size = New System.Drawing.Size(124, 29)
        Me.dob3DTP.TabIndex = 11
        '
        'name3TBX
        '
        Me.name3TBX.Location = New System.Drawing.Point(20, 127)
        Me.name3TBX.Name = "name3TBX"
        Me.name3TBX.Size = New System.Drawing.Size(146, 29)
        Me.name3TBX.TabIndex = 9
        '
        'dob2DTP
        '
        Me.dob2DTP.CustomFormat = "d/MM/yyyy"
        Me.dob2DTP.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.dob2DTP.Location = New System.Drawing.Point(341, 87)
        Me.dob2DTP.Name = "dob2DTP"
        Me.dob2DTP.Size = New System.Drawing.Size(124, 29)
        Me.dob2DTP.TabIndex = 8
        '
        'name2TBX
        '
        Me.name2TBX.Location = New System.Drawing.Point(20, 87)
        Me.name2TBX.Name = "name2TBX"
        Me.name2TBX.Size = New System.Drawing.Size(146, 29)
        Me.name2TBX.TabIndex = 6
        '
        'DOB_LBL
        '
        Me.DOB_LBL.AutoSize = True
        Me.DOB_LBL.Location = New System.Drawing.Point(341, 25)
        Me.DOB_LBL.Name = "DOB_LBL"
        Me.DOB_LBL.Size = New System.Drawing.Size(114, 24)
        Me.DOB_LBL.TabIndex = 5
        Me.DOB_LBL.Text = "Date of birth:"
        '
        'dob1DTP
        '
        Me.dob1DTP.CustomFormat = "d/MM/yyyy"
        Me.dob1DTP.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.dob1DTP.Location = New System.Drawing.Point(341, 46)
        Me.dob1DTP.Name = "dob1DTP"
        Me.dob1DTP.Size = New System.Drawing.Size(124, 29)
        Me.dob1DTP.TabIndex = 4
        '
        'pos1CBO
        '
        Me.pos1CBO.FormattingEnabled = True
        Me.pos1CBO.Location = New System.Drawing.Point(191, 45)
        Me.pos1CBO.Name = "pos1CBO"
        Me.pos1CBO.Size = New System.Drawing.Size(121, 32)
        Me.pos1CBO.TabIndex = 3
        '
        'PositionLBL
        '
        Me.PositionLBL.AutoSize = True
        Me.PositionLBL.Location = New System.Drawing.Point(188, 24)
        Me.PositionLBL.Name = "PositionLBL"
        Me.PositionLBL.Size = New System.Drawing.Size(81, 24)
        Me.PositionLBL.TabIndex = 2
        Me.PositionLBL.Text = "Position:"
        '
        'name1TBX
        '
        Me.name1TBX.Location = New System.Drawing.Point(20, 46)
        Me.name1TBX.Name = "name1TBX"
        Me.name1TBX.Size = New System.Drawing.Size(146, 29)
        Me.name1TBX.TabIndex = 1
        '
        'nameLBL
        '
        Me.nameLBL.AutoSize = True
        Me.nameLBL.Location = New System.Drawing.Point(17, 24)
        Me.nameLBL.Name = "nameLBL"
        Me.nameLBL.Size = New System.Drawing.Size(66, 24)
        Me.nameLBL.TabIndex = 0
        Me.nameLBL.Text = "Name:"
        '
        'teamToDisplayLBL
        '
        Me.teamToDisplayLBL.AutoSize = True
        Me.teamToDisplayLBL.Location = New System.Drawing.Point(12, 241)
        Me.teamToDisplayLBL.Name = "teamToDisplayLBL"
        Me.teamToDisplayLBL.Size = New System.Drawing.Size(147, 24)
        Me.teamToDisplayLBL.TabIndex = 2
        Me.teamToDisplayLBL.Text = "Team to display:"
        '
        'teamLBX
        '
        Me.teamLBX.FormattingEnabled = True
        Me.teamLBX.ItemHeight = 24
        Me.teamLBX.Location = New System.Drawing.Point(13, 268)
        Me.teamLBX.Name = "teamLBX"
        Me.teamLBX.Size = New System.Drawing.Size(197, 124)
        Me.teamLBX.TabIndex = 3
        '
        'makeTeamBTN
        '
        Me.makeTeamBTN.Location = New System.Drawing.Point(15, 192)
        Me.makeTeamBTN.Name = "makeTeamBTN"
        Me.makeTeamBTN.Size = New System.Drawing.Size(195, 31)
        Me.makeTeamBTN.TabIndex = 4
        Me.makeTeamBTN.Text = "Make The Team"
        Me.makeTeamBTN.UseVisualStyleBackColor = True
        '
        'outTBX
        '
        Me.outTBX.Location = New System.Drawing.Point(240, 247)
        Me.outTBX.Multiline = True
        Me.outTBX.Name = "outTBX"
        Me.outTBX.ReadOnly = True
        Me.outTBX.Size = New System.Drawing.Size(479, 151)
        Me.outTBX.TabIndex = 5
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(11.0!, 24.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(731, 412)
        Me.Controls.Add(Me.outTBX)
        Me.Controls.Add(Me.makeTeamBTN)
        Me.Controls.Add(Me.teamLBX)
        Me.Controls.Add(Me.teamToDisplayLBL)
        Me.Controls.Add(Me.playersGBX)
        Me.Controls.Add(Me.newTeamGBX)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Name = "Form1"
        Me.Text = "Make A Team"
        Me.newTeamGBX.ResumeLayout(False)
        Me.newTeamGBX.PerformLayout()
        Me.playersGBX.ResumeLayout(False)
        Me.playersGBX.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents newTeamGBX As GroupBox
    Friend WithEvents teamNameTBX As TextBox
    Friend WithEvents teamNameLBL As Label
    Friend WithEvents leagueLBL As Label
    Friend WithEvents leagueCBO As ComboBox
    Friend WithEvents playersGBX As GroupBox
    Friend WithEvents dob4DTP As DateTimePicker
    Friend WithEvents name4TBX As TextBox
    Friend WithEvents name3TBX As TextBox
    Friend WithEvents name2TBX As TextBox
    Friend WithEvents DOB_LBL As Label
    Friend WithEvents dob1DTP As DateTimePicker
    Friend WithEvents pos1CBO As ComboBox
    Friend WithEvents PositionLBL As Label
    Friend WithEvents name1TBX As TextBox
    Friend WithEvents nameLBL As Label
    Friend WithEvents teamToDisplayLBL As Label
    Friend WithEvents teamLBX As ListBox
    Friend WithEvents makeTeamBTN As Button
    Friend WithEvents outTBX As TextBox
    Friend WithEvents dob3DTP As DateTimePicker
    Friend WithEvents dob2DTP As DateTimePicker
    Friend WithEvents pos4CBX As ComboBox
    Friend WithEvents pos3CBX As ComboBox
    Friend WithEvents pos2CBX As ComboBox
End Class
