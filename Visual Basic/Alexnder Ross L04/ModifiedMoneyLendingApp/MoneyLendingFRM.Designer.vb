<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class MoneyLendingFRM
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
        Me.loanAmountLBL = New System.Windows.Forms.Label()
        Me.minTermLBL = New System.Windows.Forms.Label()
        Me.maxTermLBL = New System.Windows.Forms.Label()
        Me.intRateLBL = New System.Windows.Forms.Label()
        Me.loanAmountTBX = New System.Windows.Forms.TextBox()
        Me.titleLBL = New System.Windows.Forms.Label()
        Me.paymentAmountLBL = New System.Windows.Forms.Label()
        Me.intRateTBX = New System.Windows.Forms.TextBox()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.Edmonton = New System.Windows.Forms.RadioButton()
        Me.OnePercentDiscount = New System.Windows.Forms.RadioButton()
        Me.SignBonus = New System.Windows.Forms.RadioButton()
        Me.MinUpDown = New System.Windows.Forms.NumericUpDown()
        Me.MaxUpDown = New System.Windows.Forms.NumericUpDown()
        Me.DisplayBox = New System.Windows.Forms.TextBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.GroupBox1.SuspendLayout()
        CType(Me.MinUpDown, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.MaxUpDown, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'loanAmountLBL
        '
        Me.loanAmountLBL.AutoSize = True
        Me.loanAmountLBL.Location = New System.Drawing.Point(19, 67)
        Me.loanAmountLBL.Name = "loanAmountLBL"
        Me.loanAmountLBL.Size = New System.Drawing.Size(132, 25)
        Me.loanAmountLBL.TabIndex = 0
        Me.loanAmountLBL.Text = "Loan amount:"
        '
        'minTermLBL
        '
        Me.minTermLBL.AutoSize = True
        Me.minTermLBL.Location = New System.Drawing.Point(-1, 116)
        Me.minTermLBL.Name = "minTermLBL"
        Me.minTermLBL.Size = New System.Drawing.Size(207, 25)
        Me.minTermLBL.TabIndex = 1
        Me.minTermLBL.Text = "Minimum term (years):"
        '
        'maxTermLBL
        '
        Me.maxTermLBL.AutoSize = True
        Me.maxTermLBL.Location = New System.Drawing.Point(-1, 172)
        Me.maxTermLBL.Name = "maxTermLBL"
        Me.maxTermLBL.Size = New System.Drawing.Size(213, 25)
        Me.maxTermLBL.TabIndex = 2
        Me.maxTermLBL.Text = "Maximum term (years):"
        '
        'intRateLBL
        '
        Me.intRateLBL.AutoSize = True
        Me.intRateLBL.Location = New System.Drawing.Point(-1, 225)
        Me.intRateLBL.Name = "intRateLBL"
        Me.intRateLBL.Size = New System.Drawing.Size(223, 25)
        Me.intRateLBL.TabIndex = 3
        Me.intRateLBL.Text = "Annual interest rate (%):"
        '
        'loanAmountTBX
        '
        Me.loanAmountTBX.Location = New System.Drawing.Point(157, 64)
        Me.loanAmountTBX.Name = "loanAmountTBX"
        Me.loanAmountTBX.Size = New System.Drawing.Size(134, 30)
        Me.loanAmountTBX.TabIndex = 6
        Me.loanAmountTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'titleLBL
        '
        Me.titleLBL.AutoSize = True
        Me.titleLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 18.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.titleLBL.ForeColor = System.Drawing.Color.Purple
        Me.titleLBL.Location = New System.Drawing.Point(53, 14)
        Me.titleLBL.Name = "titleLBL"
        Me.titleLBL.Size = New System.Drawing.Size(523, 36)
        Me.titleLBL.TabIndex = 9
        Me.titleLBL.Text = "Enhanced Money Lender Calculator"
        '
        'paymentAmountLBL
        '
        Me.paymentAmountLBL.AutoSize = True
        Me.paymentAmountLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.paymentAmountLBL.Location = New System.Drawing.Point(420, 64)
        Me.paymentAmountLBL.Name = "paymentAmountLBL"
        Me.paymentAmountLBL.Size = New System.Drawing.Size(263, 25)
        Me.paymentAmountLBL.TabIndex = 10
        Me.paymentAmountLBL.Text = "Annual payment amounts:"
        '
        'intRateTBX
        '
        Me.intRateTBX.Location = New System.Drawing.Point(236, 222)
        Me.intRateTBX.Name = "intRateTBX"
        Me.intRateTBX.Size = New System.Drawing.Size(55, 30)
        Me.intRateTBX.TabIndex = 7
        Me.intRateTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.Edmonton)
        Me.GroupBox1.Controls.Add(Me.OnePercentDiscount)
        Me.GroupBox1.Controls.Add(Me.SignBonus)
        Me.GroupBox1.Location = New System.Drawing.Point(24, 298)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(267, 158)
        Me.GroupBox1.TabIndex = 12
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Borrowing Options"
        '
        'Edmonton
        '
        Me.Edmonton.AutoSize = True
        Me.Edmonton.Location = New System.Drawing.Point(32, 113)
        Me.Edmonton.Name = "Edmonton"
        Me.Edmonton.Size = New System.Drawing.Size(159, 29)
        Me.Edmonton.TabIndex = 2
        Me.Edmonton.TabStop = True
        Me.Edmonton.Text = "Hockey tickets"
        Me.Edmonton.UseVisualStyleBackColor = True
        '
        'OnePercentDiscount
        '
        Me.OnePercentDiscount.AutoSize = True
        Me.OnePercentDiscount.Location = New System.Drawing.Point(32, 78)
        Me.OnePercentDiscount.Name = "OnePercentDiscount"
        Me.OnePercentDiscount.Size = New System.Drawing.Size(195, 29)
        Me.OnePercentDiscount.TabIndex = 1
        Me.OnePercentDiscount.TabStop = True
        Me.OnePercentDiscount.Text = "Apply 1% discount"
        Me.OnePercentDiscount.UseVisualStyleBackColor = True
        '
        'SignBonus
        '
        Me.SignBonus.AutoSize = True
        Me.SignBonus.Location = New System.Drawing.Point(32, 43)
        Me.SignBonus.Name = "SignBonus"
        Me.SignBonus.Size = New System.Drawing.Size(214, 29)
        Me.SignBonus.TabIndex = 0
        Me.SignBonus.TabStop = True
        Me.SignBonus.Text = "$1000 signing bonus"
        Me.SignBonus.UseVisualStyleBackColor = True
        '
        'MinUpDown
        '
        Me.MinUpDown.Location = New System.Drawing.Point(236, 118)
        Me.MinUpDown.Maximum = New Decimal(New Integer() {10, 0, 0, 0})
        Me.MinUpDown.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.MinUpDown.Name = "MinUpDown"
        Me.MinUpDown.Size = New System.Drawing.Size(54, 30)
        Me.MinUpDown.TabIndex = 13
        Me.MinUpDown.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'MaxUpDown
        '
        Me.MaxUpDown.Location = New System.Drawing.Point(237, 172)
        Me.MaxUpDown.Maximum = New Decimal(New Integer() {10, 0, 0, 0})
        Me.MaxUpDown.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.MaxUpDown.Name = "MaxUpDown"
        Me.MaxUpDown.Size = New System.Drawing.Size(54, 30)
        Me.MaxUpDown.TabIndex = 14
        Me.MaxUpDown.Value = New Decimal(New Integer() {1, 0, 0, 0})
        '
        'DisplayBox
        '
        Me.DisplayBox.Location = New System.Drawing.Point(425, 116)
        Me.DisplayBox.Multiline = True
        Me.DisplayBox.Name = "DisplayBox"
        Me.DisplayBox.ReadOnly = True
        Me.DisplayBox.Size = New System.Drawing.Size(258, 254)
        Me.DisplayBox.TabIndex = 15
        '
        'Button1
        '
        Me.Button1.Enabled = False
        Me.Button1.Location = New System.Drawing.Point(560, 381)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(123, 75)
        Me.Button1.TabIndex = 16
        Me.Button1.Text = "Calculate Payments"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(425, 381)
        Me.PictureBox1.MaximumSize = New System.Drawing.Size(129, 75)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(129, 75)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox1.TabIndex = 17
        Me.PictureBox1.TabStop = False
        '
        'MoneyLendingFRM
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(12.0!, 25.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(240, Byte), Integer), CType(CType(240, Byte), Integer), CType(CType(240, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(772, 468)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.DisplayBox)
        Me.Controls.Add(Me.MaxUpDown)
        Me.Controls.Add(Me.MinUpDown)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.paymentAmountLBL)
        Me.Controls.Add(Me.titleLBL)
        Me.Controls.Add(Me.intRateTBX)
        Me.Controls.Add(Me.loanAmountTBX)
        Me.Controls.Add(Me.intRateLBL)
        Me.Controls.Add(Me.maxTermLBL)
        Me.Controls.Add(Me.minTermLBL)
        Me.Controls.Add(Me.loanAmountLBL)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Name = "MoneyLendingFRM"
        Me.Text = "Money Lending App"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.MinUpDown, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.MaxUpDown, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents loanAmountLBL As Label
    Friend WithEvents minTermLBL As Label
    Friend WithEvents maxTermLBL As Label
    Friend WithEvents intRateLBL As Label
    Friend WithEvents loanAmountTBX As TextBox
    Friend WithEvents titleLBL As Label
    Friend WithEvents paymentAmountLBL As Label
    Friend WithEvents intRateTBX As TextBox
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents Edmonton As RadioButton
    Friend WithEvents OnePercentDiscount As RadioButton
    Friend WithEvents SignBonus As RadioButton
    Friend WithEvents MinUpDown As NumericUpDown
    Friend WithEvents MaxUpDown As NumericUpDown
    Friend WithEvents DisplayBox As TextBox
    Friend WithEvents Button1 As Button
    Friend WithEvents PictureBox1 As PictureBox
End Class
