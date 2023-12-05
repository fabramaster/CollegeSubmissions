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
        Me.numberGBX = New System.Windows.Forms.GroupBox()
        Me.FourDieRBN = New System.Windows.Forms.RadioButton()
        Me.ThreeDieRBN = New System.Windows.Forms.RadioButton()
        Me.TwoDieRBN = New System.Windows.Forms.RadioButton()
        Me.OneDieRBN = New System.Windows.Forms.RadioButton()
        Me.diceGBX = New System.Windows.Forms.GroupBox()
        Me.PictureBox4 = New System.Windows.Forms.PictureBox()
        Me.PictureBox3 = New System.Windows.Forms.PictureBox()
        Me.PictureBox2 = New System.Windows.Forms.PictureBox()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.RollDieBTN = New System.Windows.Forms.Button()
        Me.numberGBX.SuspendLayout()
        Me.diceGBX.SuspendLayout()
        CType(Me.PictureBox4, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'numberGBX
        '
        Me.numberGBX.Controls.Add(Me.FourDieRBN)
        Me.numberGBX.Controls.Add(Me.ThreeDieRBN)
        Me.numberGBX.Controls.Add(Me.TwoDieRBN)
        Me.numberGBX.Controls.Add(Me.OneDieRBN)
        Me.numberGBX.Location = New System.Drawing.Point(25, 27)
        Me.numberGBX.Name = "numberGBX"
        Me.numberGBX.Size = New System.Drawing.Size(183, 321)
        Me.numberGBX.TabIndex = 0
        Me.numberGBX.TabStop = False
        Me.numberGBX.Text = "Number of dice"
        '
        'FourDieRBN
        '
        Me.FourDieRBN.AutoSize = True
        Me.FourDieRBN.Location = New System.Drawing.Point(0, 246)
        Me.FourDieRBN.Name = "FourDieRBN"
        Me.FourDieRBN.Size = New System.Drawing.Size(139, 35)
        Me.FourDieRBN.TabIndex = 3
        Me.FourDieRBN.Text = "Four Die"
        Me.FourDieRBN.UseVisualStyleBackColor = True
        '
        'ThreeDieRBN
        '
        Me.ThreeDieRBN.AutoSize = True
        Me.ThreeDieRBN.Location = New System.Drawing.Point(0, 192)
        Me.ThreeDieRBN.Name = "ThreeDieRBN"
        Me.ThreeDieRBN.Size = New System.Drawing.Size(154, 35)
        Me.ThreeDieRBN.TabIndex = 2
        Me.ThreeDieRBN.Text = "Three Die"
        Me.ThreeDieRBN.UseVisualStyleBackColor = True
        '
        'TwoDieRBN
        '
        Me.TwoDieRBN.AutoSize = True
        Me.TwoDieRBN.Location = New System.Drawing.Point(0, 133)
        Me.TwoDieRBN.Name = "TwoDieRBN"
        Me.TwoDieRBN.Size = New System.Drawing.Size(135, 35)
        Me.TwoDieRBN.TabIndex = 1
        Me.TwoDieRBN.Text = "Two Die"
        Me.TwoDieRBN.UseVisualStyleBackColor = True
        '
        'OneDieRBN
        '
        Me.OneDieRBN.AutoSize = True
        Me.OneDieRBN.Location = New System.Drawing.Point(0, 72)
        Me.OneDieRBN.Name = "OneDieRBN"
        Me.OneDieRBN.Size = New System.Drawing.Size(134, 35)
        Me.OneDieRBN.TabIndex = 0
        Me.OneDieRBN.Text = "One Die"
        Me.OneDieRBN.UseVisualStyleBackColor = True
        '
        'diceGBX
        '
        Me.diceGBX.BackColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.diceGBX.Controls.Add(Me.PictureBox4)
        Me.diceGBX.Controls.Add(Me.PictureBox3)
        Me.diceGBX.Controls.Add(Me.PictureBox2)
        Me.diceGBX.Controls.Add(Me.PictureBox1)
        Me.diceGBX.Location = New System.Drawing.Point(246, 27)
        Me.diceGBX.Name = "diceGBX"
        Me.diceGBX.Size = New System.Drawing.Size(465, 321)
        Me.diceGBX.TabIndex = 1
        Me.diceGBX.TabStop = False
        Me.diceGBX.Text = "Roll the dice"
        '
        'PictureBox4
        '
        Me.PictureBox4.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox4.Location = New System.Drawing.Point(275, 192)
        Me.PictureBox4.Name = "PictureBox4"
        Me.PictureBox4.Size = New System.Drawing.Size(110, 110)
        Me.PictureBox4.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox4.TabIndex = 3
        Me.PictureBox4.TabStop = False
        Me.PictureBox4.Visible = False
        '
        'PictureBox3
        '
        Me.PictureBox3.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox3.Location = New System.Drawing.Point(50, 192)
        Me.PictureBox3.Name = "PictureBox3"
        Me.PictureBox3.Size = New System.Drawing.Size(110, 110)
        Me.PictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox3.TabIndex = 2
        Me.PictureBox3.TabStop = False
        Me.PictureBox3.Visible = False
        '
        'PictureBox2
        '
        Me.PictureBox2.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox2.Location = New System.Drawing.Point(275, 58)
        Me.PictureBox2.Name = "PictureBox2"
        Me.PictureBox2.Size = New System.Drawing.Size(110, 110)
        Me.PictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox2.TabIndex = 1
        Me.PictureBox2.TabStop = False
        Me.PictureBox2.Visible = False
        '
        'PictureBox1
        '
        Me.PictureBox1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch
        Me.PictureBox1.Location = New System.Drawing.Point(50, 58)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(110, 110)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 0
        Me.PictureBox1.TabStop = False
        Me.PictureBox1.Visible = False
        '
        'RollDieBTN
        '
        Me.RollDieBTN.Location = New System.Drawing.Point(487, 370)
        Me.RollDieBTN.Name = "RollDieBTN"
        Me.RollDieBTN.Size = New System.Drawing.Size(200, 63)
        Me.RollDieBTN.TabIndex = 2
        Me.RollDieBTN.Text = "Roll The Dice"
        Me.RollDieBTN.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(15.0!, 30.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(740, 445)
        Me.Controls.Add(Me.RollDieBTN)
        Me.Controls.Add(Me.diceGBX)
        Me.Controls.Add(Me.numberGBX)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(6)
        Me.Name = "Form1"
        Me.Text = "Dice Roller App"
        Me.numberGBX.ResumeLayout(False)
        Me.numberGBX.PerformLayout()
        Me.diceGBX.ResumeLayout(False)
        CType(Me.PictureBox4, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox3, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox2, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents numberGBX As GroupBox
    Friend WithEvents diceGBX As GroupBox
    Friend WithEvents FourDieRBN As RadioButton
    Friend WithEvents ThreeDieRBN As RadioButton
    Friend WithEvents TwoDieRBN As RadioButton
    Friend WithEvents OneDieRBN As RadioButton
    Friend WithEvents RollDieBTN As Button
    Friend WithEvents PictureBox2 As PictureBox
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents PictureBox4 As PictureBox
    Friend WithEvents PictureBox3 As PictureBox
End Class
