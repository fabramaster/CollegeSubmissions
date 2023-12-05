<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.loanDataGBX = New System.Windows.Forms.GroupBox()
        Me.interestTBX = New System.Windows.Forms.TextBox()
        Me.amountTBX = New System.Windows.Forms.TextBox()
        Me.interestRateLBL = New System.Windows.Forms.Label()
        Me.mortgageAountLBL = New System.Windows.Forms.Label()
        Me.displayOptionsGBX = New System.Windows.Forms.GroupBox()
        Me.fifty = New System.Windows.Forms.CheckBox()
        Me.twentyfive = New System.Windows.Forms.CheckBox()
        Me.five = New System.Windows.Forms.CheckBox()
        Me.ten = New System.Windows.Forms.CheckBox()
        Me.titleLBL = New System.Windows.Forms.Label()
        Me.monthlyPmtsLBL = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.BackgroundWorker1 = New System.ComponentModel.BackgroundWorker()
        Me.TextBox1 = New System.Windows.Forms.TextBox()
        Me.loanDataGBX.SuspendLayout()
        Me.displayOptionsGBX.SuspendLayout()
        Me.SuspendLayout()
        '
        'loanDataGBX
        '
        Me.loanDataGBX.Controls.Add(Me.interestTBX)
        Me.loanDataGBX.Controls.Add(Me.amountTBX)
        Me.loanDataGBX.Controls.Add(Me.interestRateLBL)
        Me.loanDataGBX.Controls.Add(Me.mortgageAountLBL)
        Me.loanDataGBX.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.loanDataGBX.Location = New System.Drawing.Point(11, 43)
        Me.loanDataGBX.Margin = New System.Windows.Forms.Padding(2)
        Me.loanDataGBX.Name = "loanDataGBX"
        Me.loanDataGBX.Padding = New System.Windows.Forms.Padding(2)
        Me.loanDataGBX.Size = New System.Drawing.Size(265, 149)
        Me.loanDataGBX.TabIndex = 0
        Me.loanDataGBX.TabStop = False
        Me.loanDataGBX.Text = "Mortgage Data:"
        '
        'interestTBX
        '
        Me.interestTBX.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.interestTBX.Location = New System.Drawing.Point(179, 80)
        Me.interestTBX.Margin = New System.Windows.Forms.Padding(2)
        Me.interestTBX.Name = "interestTBX"
        Me.interestTBX.Size = New System.Drawing.Size(81, 28)
        Me.interestTBX.TabIndex = 3
        Me.interestTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'amountTBX
        '
        Me.amountTBX.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.amountTBX.Location = New System.Drawing.Point(179, 20)
        Me.amountTBX.Margin = New System.Windows.Forms.Padding(2)
        Me.amountTBX.Name = "amountTBX"
        Me.amountTBX.Size = New System.Drawing.Size(78, 28)
        Me.amountTBX.TabIndex = 2
        Me.amountTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'interestRateLBL
        '
        Me.interestRateLBL.AutoSize = True
        Me.interestRateLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.interestRateLBL.Location = New System.Drawing.Point(4, 83)
        Me.interestRateLBL.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.interestRateLBL.Name = "interestRateLBL"
        Me.interestRateLBL.Size = New System.Drawing.Size(213, 24)
        Me.interestRateLBL.TabIndex = 1
        Me.interestRateLBL.Text = "Annual interest rate (%): "
        '
        'mortgageAountLBL
        '
        Me.mortgageAountLBL.AutoSize = True
        Me.mortgageAountLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.mortgageAountLBL.Location = New System.Drawing.Point(12, 24)
        Me.mortgageAountLBL.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.mortgageAountLBL.Name = "mortgageAountLBL"
        Me.mortgageAountLBL.Size = New System.Drawing.Size(163, 24)
        Me.mortgageAountLBL.TabIndex = 0
        Me.mortgageAountLBL.Text = "Mortgage amount:"
        '
        'displayOptionsGBX
        '
        Me.displayOptionsGBX.Controls.Add(Me.fifty)
        Me.displayOptionsGBX.Controls.Add(Me.twentyfive)
        Me.displayOptionsGBX.Controls.Add(Me.five)
        Me.displayOptionsGBX.Controls.Add(Me.ten)
        Me.displayOptionsGBX.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.displayOptionsGBX.Location = New System.Drawing.Point(11, 203)
        Me.displayOptionsGBX.Margin = New System.Windows.Forms.Padding(2)
        Me.displayOptionsGBX.Name = "displayOptionsGBX"
        Me.displayOptionsGBX.Padding = New System.Windows.Forms.Padding(2)
        Me.displayOptionsGBX.Size = New System.Drawing.Size(265, 167)
        Me.displayOptionsGBX.TabIndex = 1
        Me.displayOptionsGBX.TabStop = False
        Me.displayOptionsGBX.Text = "Payment Options:"
        '
        'fifty
        '
        Me.fifty.AutoSize = True
        Me.fifty.Location = New System.Drawing.Point(131, 88)
        Me.fifty.Name = "fifty"
        Me.fifty.Size = New System.Drawing.Size(102, 28)
        Me.fifty.TabIndex = 4
        Me.fifty.Text = "50 years"
        Me.fifty.UseVisualStyleBackColor = True
        '
        'twentyfive
        '
        Me.twentyfive.AutoSize = True
        Me.twentyfive.Location = New System.Drawing.Point(131, 26)
        Me.twentyfive.Name = "twentyfive"
        Me.twentyfive.Size = New System.Drawing.Size(102, 28)
        Me.twentyfive.TabIndex = 3
        Me.twentyfive.Text = "25 years"
        Me.twentyfive.UseVisualStyleBackColor = True
        '
        'five
        '
        Me.five.AutoSize = True
        Me.five.Location = New System.Drawing.Point(2, 26)
        Me.five.Name = "five"
        Me.five.Size = New System.Drawing.Size(95, 28)
        Me.five.TabIndex = 2
        Me.five.Text = "5 Years"
        Me.five.UseVisualStyleBackColor = True
        '
        'ten
        '
        Me.ten.AutoSize = True
        Me.ten.Location = New System.Drawing.Point(0, 88)
        Me.ten.Name = "ten"
        Me.ten.Size = New System.Drawing.Size(102, 28)
        Me.ten.TabIndex = 1
        Me.ten.Text = "10 years"
        Me.ten.UseVisualStyleBackColor = True
        '
        'titleLBL
        '
        Me.titleLBL.AutoSize = True
        Me.titleLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.titleLBL.ForeColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(0, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.titleLBL.Location = New System.Drawing.Point(72, 9)
        Me.titleLBL.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.titleLBL.Name = "titleLBL"
        Me.titleLBL.Size = New System.Drawing.Size(344, 29)
        Me.titleLBL.TabIndex = 2
        Me.titleLBL.Text = "Enhanced Mortgage Calculator"
        '
        'monthlyPmtsLBL
        '
        Me.monthlyPmtsLBL.AutoSize = True
        Me.monthlyPmtsLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.monthlyPmtsLBL.Location = New System.Drawing.Point(280, 38)
        Me.monthlyPmtsLBL.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.monthlyPmtsLBL.Name = "monthlyPmtsLBL"
        Me.monthlyPmtsLBL.Size = New System.Drawing.Size(181, 24)
        Me.monthlyPmtsLBL.TabIndex = 4
        Me.monthlyPmtsLBL.Text = "Mortgage payments:"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(284, 322)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(291, 48)
        Me.Button1.TabIndex = 5
        Me.Button1.Text = "Calculate Payments"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'TextBox1
        '
        Me.TextBox1.BackColor = System.Drawing.Color.Silver
        Me.TextBox1.Location = New System.Drawing.Point(284, 61)
        Me.TextBox1.MaximumSize = New System.Drawing.Size(500, 500)
        Me.TextBox1.MinimumSize = New System.Drawing.Size(200, 250)
        Me.TextBox1.Multiline = True
        Me.TextBox1.Name = "TextBox1"
        Me.TextBox1.Size = New System.Drawing.Size(312, 250)
        Me.TextBox1.TabIndex = 6
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(12.0!, 25.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(608, 410)
        Me.Controls.Add(Me.TextBox1)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.monthlyPmtsLBL)
        Me.Controls.Add(Me.titleLBL)
        Me.Controls.Add(Me.displayOptionsGBX)
        Me.Controls.Add(Me.loanDataGBX)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Name = "Form1"
        Me.Text = "Enhanced Mortgage App"
        Me.loanDataGBX.ResumeLayout(False)
        Me.loanDataGBX.PerformLayout()
        Me.displayOptionsGBX.ResumeLayout(False)
        Me.displayOptionsGBX.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents loanDataGBX As GroupBox
    Friend WithEvents interestRateLBL As Label
    Friend WithEvents mortgageAountLBL As Label
    Friend WithEvents displayOptionsGBX As GroupBox
    Friend WithEvents titleLBL As Label
    Friend WithEvents interestTBX As TextBox
    Friend WithEvents amountTBX As TextBox
    Friend WithEvents monthlyPmtsLBL As Label
    Friend WithEvents fifty As CheckBox
    Friend WithEvents twentyfive As CheckBox
    Friend WithEvents five As CheckBox
    Friend WithEvents ten As CheckBox
    Friend WithEvents Button1 As Button
    Friend WithEvents BackgroundWorker1 As System.ComponentModel.BackgroundWorker
    Friend WithEvents TextBox1 As TextBox
End Class
