<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class LoanApplicationFRM
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
        Me.newAppGBX = New System.Windows.Forms.GroupBox()
        Me.addBTN = New System.Windows.Forms.Button()
        Me.asset3ValueTBX = New System.Windows.Forms.TextBox()
        Me.asset2ValueTBX = New System.Windows.Forms.TextBox()
        Me.asset1ValueTBX = New System.Windows.Forms.TextBox()
        Me.asset3DescTBX = New System.Windows.Forms.TextBox()
        Me.asset3LBL = New System.Windows.Forms.Label()
        Me.asset2DescTBX = New System.Windows.Forms.TextBox()
        Me.asset2LBL = New System.Windows.Forms.Label()
        Me.asset1DescTBX = New System.Windows.Forms.TextBox()
        Me.valueLBL = New System.Windows.Forms.Label()
        Me.asset1LBL = New System.Windows.Forms.Label()
        Me.assetHeadingLBL = New System.Windows.Forms.Label()
        Me.dobDTP = New System.Windows.Forms.DateTimePicker()
        Me.accountNoTBX = New System.Windows.Forms.TextBox()
        Me.accountNoLBL = New System.Windows.Forms.Label()
        Me.nameTBX = New System.Windows.Forms.TextBox()
        Me.dobLBL = New System.Windows.Forms.Label()
        Me.nameLBL = New System.Windows.Forms.Label()
        Me.applicantCBO = New System.Windows.Forms.ComboBox()
        Me.applicantSelectLBL = New System.Windows.Forms.Label()
        Me.appSummaryHeadingLBL = New System.Windows.Forms.Label()
        Me.summaryTBX = New System.Windows.Forms.TextBox()
        Me.newAppGBX.SuspendLayout()
        Me.SuspendLayout()
        '
        'newAppGBX
        '
        Me.newAppGBX.Controls.Add(Me.addBTN)
        Me.newAppGBX.Controls.Add(Me.asset3ValueTBX)
        Me.newAppGBX.Controls.Add(Me.asset2ValueTBX)
        Me.newAppGBX.Controls.Add(Me.asset1ValueTBX)
        Me.newAppGBX.Controls.Add(Me.asset3DescTBX)
        Me.newAppGBX.Controls.Add(Me.asset3LBL)
        Me.newAppGBX.Controls.Add(Me.asset2DescTBX)
        Me.newAppGBX.Controls.Add(Me.asset2LBL)
        Me.newAppGBX.Controls.Add(Me.asset1DescTBX)
        Me.newAppGBX.Controls.Add(Me.valueLBL)
        Me.newAppGBX.Controls.Add(Me.asset1LBL)
        Me.newAppGBX.Controls.Add(Me.assetHeadingLBL)
        Me.newAppGBX.Controls.Add(Me.dobDTP)
        Me.newAppGBX.Controls.Add(Me.accountNoTBX)
        Me.newAppGBX.Controls.Add(Me.accountNoLBL)
        Me.newAppGBX.Controls.Add(Me.nameTBX)
        Me.newAppGBX.Controls.Add(Me.dobLBL)
        Me.newAppGBX.Controls.Add(Me.nameLBL)
        Me.newAppGBX.Location = New System.Drawing.Point(23, 22)
        Me.newAppGBX.Name = "newAppGBX"
        Me.newAppGBX.Size = New System.Drawing.Size(664, 256)
        Me.newAppGBX.TabIndex = 0
        Me.newAppGBX.TabStop = False
        Me.newAppGBX.Text = "New Applicant Entry:"
        '
        'addBTN
        '
        Me.addBTN.Location = New System.Drawing.Point(464, 198)
        Me.addBTN.Name = "addBTN"
        Me.addBTN.Size = New System.Drawing.Size(172, 40)
        Me.addBTN.TabIndex = 18
        Me.addBTN.Text = "Add Applicant"
        Me.addBTN.UseVisualStyleBackColor = True
        '
        'asset3ValueTBX
        '
        Me.asset3ValueTBX.Location = New System.Drawing.Point(525, 141)
        Me.asset3ValueTBX.Name = "asset3ValueTBX"
        Me.asset3ValueTBX.Size = New System.Drawing.Size(111, 35)
        Me.asset3ValueTBX.TabIndex = 17
        Me.asset3ValueTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'asset2ValueTBX
        '
        Me.asset2ValueTBX.Location = New System.Drawing.Point(525, 99)
        Me.asset2ValueTBX.Name = "asset2ValueTBX"
        Me.asset2ValueTBX.Size = New System.Drawing.Size(111, 35)
        Me.asset2ValueTBX.TabIndex = 16
        Me.asset2ValueTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'asset1ValueTBX
        '
        Me.asset1ValueTBX.Location = New System.Drawing.Point(525, 57)
        Me.asset1ValueTBX.Name = "asset1ValueTBX"
        Me.asset1ValueTBX.Size = New System.Drawing.Size(111, 35)
        Me.asset1ValueTBX.TabIndex = 15
        Me.asset1ValueTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'asset3DescTBX
        '
        Me.asset3DescTBX.Location = New System.Drawing.Point(354, 141)
        Me.asset3DescTBX.Name = "asset3DescTBX"
        Me.asset3DescTBX.Size = New System.Drawing.Size(153, 35)
        Me.asset3DescTBX.TabIndex = 14
        '
        'asset3LBL
        '
        Me.asset3LBL.AutoSize = True
        Me.asset3LBL.Location = New System.Drawing.Point(246, 144)
        Me.asset3LBL.Name = "asset3LBL"
        Me.asset3LBL.Size = New System.Drawing.Size(141, 29)
        Me.asset3LBL.TabIndex = 13
        Me.asset3LBL.Text = "Description:"
        '
        'asset2DescTBX
        '
        Me.asset2DescTBX.Location = New System.Drawing.Point(354, 99)
        Me.asset2DescTBX.Name = "asset2DescTBX"
        Me.asset2DescTBX.Size = New System.Drawing.Size(153, 35)
        Me.asset2DescTBX.TabIndex = 12
        '
        'asset2LBL
        '
        Me.asset2LBL.AutoSize = True
        Me.asset2LBL.Location = New System.Drawing.Point(246, 102)
        Me.asset2LBL.Name = "asset2LBL"
        Me.asset2LBL.Size = New System.Drawing.Size(141, 29)
        Me.asset2LBL.TabIndex = 11
        Me.asset2LBL.Text = "Description:"
        '
        'asset1DescTBX
        '
        Me.asset1DescTBX.Location = New System.Drawing.Point(354, 57)
        Me.asset1DescTBX.Name = "asset1DescTBX"
        Me.asset1DescTBX.Size = New System.Drawing.Size(153, 35)
        Me.asset1DescTBX.TabIndex = 10
        '
        'valueLBL
        '
        Me.valueLBL.AutoSize = True
        Me.valueLBL.Location = New System.Drawing.Point(520, 25)
        Me.valueLBL.Name = "valueLBL"
        Me.valueLBL.Size = New System.Drawing.Size(80, 29)
        Me.valueLBL.TabIndex = 8
        Me.valueLBL.Text = "Value:"
        '
        'asset1LBL
        '
        Me.asset1LBL.AutoSize = True
        Me.asset1LBL.Location = New System.Drawing.Point(246, 60)
        Me.asset1LBL.Name = "asset1LBL"
        Me.asset1LBL.Size = New System.Drawing.Size(141, 29)
        Me.asset1LBL.TabIndex = 7
        Me.asset1LBL.Text = "Description:"
        '
        'assetHeadingLBL
        '
        Me.assetHeadingLBL.AutoSize = True
        Me.assetHeadingLBL.Location = New System.Drawing.Point(246, 25)
        Me.assetHeadingLBL.Name = "assetHeadingLBL"
        Me.assetHeadingLBL.Size = New System.Drawing.Size(234, 29)
        Me.assetHeadingLBL.TabIndex = 6
        Me.assetHeadingLBL.Text = "Assets (3 Maximum):"
        '
        'dobDTP
        '
        Me.dobDTP.CustomFormat = "dd/MM/yyyy"
        Me.dobDTP.Format = System.Windows.Forms.DateTimePickerFormat.Custom
        Me.dobDTP.Location = New System.Drawing.Point(23, 159)
        Me.dobDTP.Name = "dobDTP"
        Me.dobDTP.Size = New System.Drawing.Size(200, 35)
        Me.dobDTP.TabIndex = 5
        '
        'accountNoTBX
        '
        Me.accountNoTBX.Location = New System.Drawing.Point(23, 101)
        Me.accountNoTBX.Name = "accountNoTBX"
        Me.accountNoTBX.Size = New System.Drawing.Size(105, 35)
        Me.accountNoTBX.TabIndex = 4
        Me.accountNoTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'accountNoLBL
        '
        Me.accountNoLBL.AutoSize = True
        Me.accountNoLBL.Location = New System.Drawing.Point(18, 82)
        Me.accountNoLBL.Name = "accountNoLBL"
        Me.accountNoLBL.Size = New System.Drawing.Size(197, 29)
        Me.accountNoLBL.TabIndex = 3
        Me.accountNoLBL.Text = "Account Number:"
        '
        'nameTBX
        '
        Me.nameTBX.Location = New System.Drawing.Point(23, 44)
        Me.nameTBX.Name = "nameTBX"
        Me.nameTBX.Size = New System.Drawing.Size(177, 35)
        Me.nameTBX.TabIndex = 2
        '
        'dobLBL
        '
        Me.dobLBL.AutoSize = True
        Me.dobLBL.Location = New System.Drawing.Point(18, 139)
        Me.dobLBL.Name = "dobLBL"
        Me.dobLBL.Size = New System.Drawing.Size(71, 29)
        Me.dobLBL.TabIndex = 1
        Me.dobLBL.Text = "DOB:"
        '
        'nameLBL
        '
        Me.nameLBL.AutoSize = True
        Me.nameLBL.Location = New System.Drawing.Point(18, 25)
        Me.nameLBL.Name = "nameLBL"
        Me.nameLBL.Size = New System.Drawing.Size(84, 29)
        Me.nameLBL.TabIndex = 0
        Me.nameLBL.Text = "Name:"
        '
        'applicantCBO
        '
        Me.applicantCBO.FormattingEnabled = True
        Me.applicantCBO.Location = New System.Drawing.Point(23, 318)
        Me.applicantCBO.Name = "applicantCBO"
        Me.applicantCBO.Size = New System.Drawing.Size(223, 37)
        Me.applicantCBO.TabIndex = 1
        Me.applicantCBO.Text = "- Select Applicant -"
        '
        'applicantSelectLBL
        '
        Me.applicantSelectLBL.AutoSize = True
        Me.applicantSelectLBL.Location = New System.Drawing.Point(18, 291)
        Me.applicantSelectLBL.Name = "applicantSelectLBL"
        Me.applicantSelectLBL.Size = New System.Drawing.Size(112, 29)
        Me.applicantSelectLBL.TabIndex = 2
        Me.applicantSelectLBL.Text = "Applicant"
        '
        'appSummaryHeadingLBL
        '
        Me.appSummaryHeadingLBL.AutoSize = True
        Me.appSummaryHeadingLBL.Location = New System.Drawing.Point(289, 291)
        Me.appSummaryHeadingLBL.Name = "appSummaryHeadingLBL"
        Me.appSummaryHeadingLBL.Size = New System.Drawing.Size(245, 29)
        Me.appSummaryHeadingLBL.TabIndex = 4
        Me.appSummaryHeadingLBL.Text = "Application Summary:"
        '
        'summaryTBX
        '
        Me.summaryTBX.Location = New System.Drawing.Point(294, 323)
        Me.summaryTBX.Multiline = True
        Me.summaryTBX.Name = "summaryTBX"
        Me.summaryTBX.ReadOnly = True
        Me.summaryTBX.Size = New System.Drawing.Size(393, 140)
        Me.summaryTBX.TabIndex = 5
        '
        'LoanApplicationFRM
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(14.0!, 29.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(711, 484)
        Me.Controls.Add(Me.summaryTBX)
        Me.Controls.Add(Me.appSummaryHeadingLBL)
        Me.Controls.Add(Me.applicantSelectLBL)
        Me.Controls.Add(Me.applicantCBO)
        Me.Controls.Add(Me.newAppGBX)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(7)
        Me.Name = "LoanApplicationFRM"
        Me.Text = "Loan Applications"
        Me.newAppGBX.ResumeLayout(False)
        Me.newAppGBX.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents newAppGBX As GroupBox
    Friend WithEvents addBTN As Button
    Friend WithEvents asset3ValueTBX As TextBox
    Friend WithEvents asset2ValueTBX As TextBox
    Friend WithEvents asset1ValueTBX As TextBox
    Friend WithEvents asset3DescTBX As TextBox
    Friend WithEvents asset3LBL As Label
    Friend WithEvents asset2DescTBX As TextBox
    Friend WithEvents asset2LBL As Label
    Friend WithEvents asset1DescTBX As TextBox
    Friend WithEvents valueLBL As Label
    Friend WithEvents asset1LBL As Label
    Friend WithEvents assetHeadingLBL As Label
    Friend WithEvents dobDTP As DateTimePicker
    Friend WithEvents accountNoTBX As TextBox
    Friend WithEvents accountNoLBL As Label
    Friend WithEvents nameTBX As TextBox
    Friend WithEvents dobLBL As Label
    Friend WithEvents nameLBL As Label
    Friend WithEvents applicantCBO As ComboBox
    Friend WithEvents applicantSelectLBL As Label
    Friend WithEvents appSummaryHeadingLBL As Label
    Friend WithEvents summaryTBX As TextBox
End Class
