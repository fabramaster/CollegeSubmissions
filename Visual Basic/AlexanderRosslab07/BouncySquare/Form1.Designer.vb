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
        Me.components = New System.ComponentModel.Container()
        Me.sizeLBL = New System.Windows.Forms.Label()
        Me.sizeNUD = New System.Windows.Forms.NumericUpDown()
        Me.outTBX = New System.Windows.Forms.TextBox()
        Me.bounceTMR = New System.Windows.Forms.Timer(Me.components)
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.turboRBN = New System.Windows.Forms.RadioButton()
        Me.fastRBN = New System.Windows.Forms.RadioButton()
        Me.slowRBN = New System.Windows.Forms.RadioButton()
        Me.runBTN = New System.Windows.Forms.Button()
        Me.stepNUD = New System.Windows.Forms.NumericUpDown()
        Me.angleLBL = New System.Windows.Forms.Label()
        CType(Me.sizeNUD, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox1.SuspendLayout()
        CType(Me.stepNUD, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'sizeLBL
        '
        Me.sizeLBL.AutoSize = True
        Me.sizeLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.sizeLBL.Location = New System.Drawing.Point(23, 22)
        Me.sizeLBL.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.sizeLBL.Name = "sizeLBL"
        Me.sizeLBL.Size = New System.Drawing.Size(103, 20)
        Me.sizeLBL.TabIndex = 0
        Me.sizeLBL.Text = "Square size:"
        '
        'sizeNUD
        '
        Me.sizeNUD.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.sizeNUD.Location = New System.Drawing.Point(140, 20)
        Me.sizeNUD.Margin = New System.Windows.Forms.Padding(4)
        Me.sizeNUD.Maximum = New Decimal(New Integer() {10, 0, 0, 0})
        Me.sizeNUD.Minimum = New Decimal(New Integer() {1, 0, 0, 0})
        Me.sizeNUD.Name = "sizeNUD"
        Me.sizeNUD.Size = New System.Drawing.Size(64, 26)
        Me.sizeNUD.TabIndex = 1
        Me.sizeNUD.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        Me.sizeNUD.Value = New Decimal(New Integer() {5, 0, 0, 0})
        '
        'outTBX
        '
        Me.outTBX.BackColor = System.Drawing.Color.FromArgb(CType(CType(222, Byte), Integer), CType(CType(222, Byte), Integer), CType(CType(255, Byte), Integer))
        Me.outTBX.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.outTBX.Font = New System.Drawing.Font("Courier New", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.outTBX.Location = New System.Drawing.Point(27, 96)
        Me.outTBX.Margin = New System.Windows.Forms.Padding(4)
        Me.outTBX.Multiline = True
        Me.outTBX.Name = "outTBX"
        Me.outTBX.Size = New System.Drawing.Size(490, 406)
        Me.outTBX.TabIndex = 2
        '
        'bounceTMR
        '
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.turboRBN)
        Me.GroupBox1.Controls.Add(Me.fastRBN)
        Me.GroupBox1.Controls.Add(Me.slowRBN)
        Me.GroupBox1.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(241, 22)
        Me.GroupBox1.Margin = New System.Windows.Forms.Padding(4)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Padding = New System.Windows.Forms.Padding(4)
        Me.GroupBox1.Size = New System.Drawing.Size(276, 65)
        Me.GroupBox1.TabIndex = 3
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Speed"
        '
        'turboRBN
        '
        Me.turboRBN.AutoSize = True
        Me.turboRBN.Location = New System.Drawing.Point(183, 26)
        Me.turboRBN.Margin = New System.Windows.Forms.Padding(4)
        Me.turboRBN.Name = "turboRBN"
        Me.turboRBN.Size = New System.Drawing.Size(73, 24)
        Me.turboRBN.TabIndex = 2
        Me.turboRBN.TabStop = True
        Me.turboRBN.Text = "Turbo"
        Me.turboRBN.UseVisualStyleBackColor = True
        '
        'fastRBN
        '
        Me.fastRBN.AutoSize = True
        Me.fastRBN.Location = New System.Drawing.Point(105, 26)
        Me.fastRBN.Margin = New System.Windows.Forms.Padding(4)
        Me.fastRBN.Name = "fastRBN"
        Me.fastRBN.Size = New System.Drawing.Size(63, 24)
        Me.fastRBN.TabIndex = 1
        Me.fastRBN.TabStop = True
        Me.fastRBN.Text = "Fast"
        Me.fastRBN.UseVisualStyleBackColor = True
        '
        'slowRBN
        '
        Me.slowRBN.AutoSize = True
        Me.slowRBN.Location = New System.Drawing.Point(24, 26)
        Me.slowRBN.Margin = New System.Windows.Forms.Padding(4)
        Me.slowRBN.Name = "slowRBN"
        Me.slowRBN.Size = New System.Drawing.Size(66, 24)
        Me.slowRBN.TabIndex = 0
        Me.slowRBN.TabStop = True
        Me.slowRBN.Text = "Slow"
        Me.slowRBN.UseVisualStyleBackColor = True
        '
        'runBTN
        '
        Me.runBTN.Font = New System.Drawing.Font("Microsoft Sans Serif", 11.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.runBTN.Location = New System.Drawing.Point(417, 516)
        Me.runBTN.Margin = New System.Windows.Forms.Padding(4)
        Me.runBTN.Name = "runBTN"
        Me.runBTN.Size = New System.Drawing.Size(100, 36)
        Me.runBTN.TabIndex = 4
        Me.runBTN.Text = "Run"
        Me.runBTN.UseVisualStyleBackColor = True
        '
        'stepNUD
        '
        Me.stepNUD.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.stepNUD.Location = New System.Drawing.Point(140, 58)
        Me.stepNUD.Margin = New System.Windows.Forms.Padding(4)
        Me.stepNUD.Maximum = New Decimal(New Integer() {3, 0, 0, 0})
        Me.stepNUD.Name = "stepNUD"
        Me.stepNUD.Size = New System.Drawing.Size(64, 26)
        Me.stepNUD.TabIndex = 6
        Me.stepNUD.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        Me.stepNUD.Value = New Decimal(New Integer() {2, 0, 0, 0})
        '
        'angleLBL
        '
        Me.angleLBL.AutoSize = True
        Me.angleLBL.Font = New System.Drawing.Font("Microsoft Sans Serif", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.angleLBL.Location = New System.Drawing.Point(23, 60)
        Me.angleLBL.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.angleLBL.Name = "angleLBL"
        Me.angleLBL.Size = New System.Drawing.Size(103, 20)
        Me.angleLBL.TabIndex = 5
        Me.angleLBL.Text = "Step setting:"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(533, 566)
        Me.Controls.Add(Me.stepNUD)
        Me.Controls.Add(Me.angleLBL)
        Me.Controls.Add(Me.runBTN)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.outTBX)
        Me.Controls.Add(Me.sizeNUD)
        Me.Controls.Add(Me.sizeLBL)
        Me.Margin = New System.Windows.Forms.Padding(4)
        Me.Name = "Form1"
        Me.Text = "Bouncy Squares"
        CType(Me.sizeNUD, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.stepNUD, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents sizeLBL As Label
    Friend WithEvents sizeNUD As NumericUpDown
    Friend WithEvents outTBX As TextBox
    Friend WithEvents bounceTMR As Timer
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents turboRBN As RadioButton
    Friend WithEvents fastRBN As RadioButton
    Friend WithEvents slowRBN As RadioButton
    Friend WithEvents runBTN As Button
    Friend WithEvents stepNUD As NumericUpDown
    Friend WithEvents angleLBL As Label
End Class
