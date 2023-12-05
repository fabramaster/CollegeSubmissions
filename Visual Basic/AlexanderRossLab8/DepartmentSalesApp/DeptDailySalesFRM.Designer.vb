<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class DeptDailySalesFRM
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
        Me.mondayLBL = New System.Windows.Forms.Label()
        Me.tuesdayLBL = New System.Windows.Forms.Label()
        Me.wednesdayLBL = New System.Windows.Forms.Label()
        Me.thursdayLBL = New System.Windows.Forms.Label()
        Me.fridayLBL = New System.Windows.Forms.Label()
        Me.monTBX = New System.Windows.Forms.TextBox()
        Me.tueTBX = New System.Windows.Forms.TextBox()
        Me.wedTBX = New System.Windows.Forms.TextBox()
        Me.thuTBX = New System.Windows.Forms.TextBox()
        Me.friTBX = New System.Windows.Forms.TextBox()
        Me.totalDescLBL = New System.Windows.Forms.Label()
        Me.subTotalsBTN = New System.Windows.Forms.Button()
        Me.clearDataBTN = New System.Windows.Forms.Button()
        Me.addBTN = New System.Windows.Forms.Button()
        Me.outLBX = New System.Windows.Forms.ListBox()
        Me.deptCBO = New System.Windows.Forms.ComboBox()
        Me.totalLBL = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'mondayLBL
        '
        Me.mondayLBL.AutoSize = True
        Me.mondayLBL.Location = New System.Drawing.Point(7, 94)
        Me.mondayLBL.Name = "mondayLBL"
        Me.mondayLBL.Size = New System.Drawing.Size(66, 29)
        Me.mondayLBL.TabIndex = 1
        Me.mondayLBL.Text = "Mon:"
        '
        'tuesdayLBL
        '
        Me.tuesdayLBL.AutoSize = True
        Me.tuesdayLBL.Location = New System.Drawing.Point(7, 132)
        Me.tuesdayLBL.Name = "tuesdayLBL"
        Me.tuesdayLBL.Size = New System.Drawing.Size(62, 29)
        Me.tuesdayLBL.TabIndex = 2
        Me.tuesdayLBL.Text = "Tue:"
        '
        'wednesdayLBL
        '
        Me.wednesdayLBL.AutoSize = True
        Me.wednesdayLBL.Location = New System.Drawing.Point(7, 172)
        Me.wednesdayLBL.Name = "wednesdayLBL"
        Me.wednesdayLBL.Size = New System.Drawing.Size(69, 29)
        Me.wednesdayLBL.TabIndex = 3
        Me.wednesdayLBL.Text = "Wed:"
        '
        'thursdayLBL
        '
        Me.thursdayLBL.AutoSize = True
        Me.thursdayLBL.Location = New System.Drawing.Point(7, 211)
        Me.thursdayLBL.Name = "thursdayLBL"
        Me.thursdayLBL.Size = New System.Drawing.Size(61, 29)
        Me.thursdayLBL.TabIndex = 4
        Me.thursdayLBL.Text = "Thu:"
        '
        'fridayLBL
        '
        Me.fridayLBL.AutoSize = True
        Me.fridayLBL.Location = New System.Drawing.Point(7, 249)
        Me.fridayLBL.Name = "fridayLBL"
        Me.fridayLBL.Size = New System.Drawing.Size(48, 29)
        Me.fridayLBL.TabIndex = 5
        Me.fridayLBL.Text = "Fri:"
        '
        'monTBX
        '
        Me.monTBX.Location = New System.Drawing.Point(51, 91)
        Me.monTBX.Name = "monTBX"
        Me.monTBX.Size = New System.Drawing.Size(79, 35)
        Me.monTBX.TabIndex = 6
        Me.monTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'tueTBX
        '
        Me.tueTBX.Location = New System.Drawing.Point(51, 129)
        Me.tueTBX.Name = "tueTBX"
        Me.tueTBX.Size = New System.Drawing.Size(79, 35)
        Me.tueTBX.TabIndex = 7
        Me.tueTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'wedTBX
        '
        Me.wedTBX.Location = New System.Drawing.Point(51, 169)
        Me.wedTBX.Name = "wedTBX"
        Me.wedTBX.Size = New System.Drawing.Size(79, 35)
        Me.wedTBX.TabIndex = 8
        Me.wedTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'thuTBX
        '
        Me.thuTBX.Location = New System.Drawing.Point(51, 208)
        Me.thuTBX.Name = "thuTBX"
        Me.thuTBX.Size = New System.Drawing.Size(79, 35)
        Me.thuTBX.TabIndex = 9
        Me.thuTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'friTBX
        '
        Me.friTBX.Location = New System.Drawing.Point(51, 246)
        Me.friTBX.Name = "friTBX"
        Me.friTBX.Size = New System.Drawing.Size(79, 35)
        Me.friTBX.TabIndex = 10
        Me.friTBX.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'totalDescLBL
        '
        Me.totalDescLBL.AutoSize = True
        Me.totalDescLBL.Location = New System.Drawing.Point(537, 356)
        Me.totalDescLBL.Name = "totalDescLBL"
        Me.totalDescLBL.Size = New System.Drawing.Size(80, 29)
        Me.totalDescLBL.TabIndex = 13
        Me.totalDescLBL.Text = "Total: "
        '
        'subTotalsBTN
        '
        Me.subTotalsBTN.Location = New System.Drawing.Point(606, 409)
        Me.subTotalsBTN.Name = "subTotalsBTN"
        Me.subTotalsBTN.Size = New System.Drawing.Size(157, 39)
        Me.subTotalsBTN.TabIndex = 15
        Me.subTotalsBTN.Text = "Display Subtotals"
        Me.subTotalsBTN.UseVisualStyleBackColor = True
        '
        'clearDataBTN
        '
        Me.clearDataBTN.Location = New System.Drawing.Point(475, 409)
        Me.clearDataBTN.Name = "clearDataBTN"
        Me.clearDataBTN.Size = New System.Drawing.Size(114, 39)
        Me.clearDataBTN.TabIndex = 18
        Me.clearDataBTN.Text = "Clear Data"
        Me.clearDataBTN.UseVisualStyleBackColor = True
        '
        'addBTN
        '
        Me.addBTN.Location = New System.Drawing.Point(12, 289)
        Me.addBTN.Name = "addBTN"
        Me.addBTN.Size = New System.Drawing.Size(118, 39)
        Me.addBTN.TabIndex = 12
        Me.addBTN.Text = "Add Item"
        Me.addBTN.UseVisualStyleBackColor = True
        '
        'outLBX
        '
        Me.outLBX.Font = New System.Drawing.Font("Courier New", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.outLBX.FormattingEnabled = True
        Me.outLBX.ItemHeight = 27
        Me.outLBX.Location = New System.Drawing.Point(150, 24)
        Me.outLBX.MultiColumn = True
        Me.outLBX.Name = "outLBX"
        Me.outLBX.Size = New System.Drawing.Size(613, 274)
        Me.outLBX.TabIndex = 19
        '
        'deptCBO
        '
        Me.deptCBO.FormattingEnabled = True
        Me.deptCBO.Location = New System.Drawing.Point(12, 24)
        Me.deptCBO.Name = "deptCBO"
        Me.deptCBO.Size = New System.Drawing.Size(121, 37)
        Me.deptCBO.TabIndex = 20
        '
        'totalLBL
        '
        Me.totalLBL.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.totalLBL.Location = New System.Drawing.Point(624, 356)
        Me.totalLBL.Name = "totalLBL"
        Me.totalLBL.Size = New System.Drawing.Size(139, 29)
        Me.totalLBL.TabIndex = 21
        Me.totalLBL.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'DeptDailySalesFRM
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(14.0!, 29.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(787, 460)
        Me.Controls.Add(Me.totalLBL)
        Me.Controls.Add(Me.deptCBO)
        Me.Controls.Add(Me.outLBX)
        Me.Controls.Add(Me.clearDataBTN)
        Me.Controls.Add(Me.subTotalsBTN)
        Me.Controls.Add(Me.totalDescLBL)
        Me.Controls.Add(Me.addBTN)
        Me.Controls.Add(Me.friTBX)
        Me.Controls.Add(Me.thuTBX)
        Me.Controls.Add(Me.wedTBX)
        Me.Controls.Add(Me.tueTBX)
        Me.Controls.Add(Me.monTBX)
        Me.Controls.Add(Me.fridayLBL)
        Me.Controls.Add(Me.thursdayLBL)
        Me.Controls.Add(Me.wednesdayLBL)
        Me.Controls.Add(Me.tuesdayLBL)
        Me.Controls.Add(Me.mondayLBL)
        Me.Font = New System.Drawing.Font("Microsoft Sans Serif", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Margin = New System.Windows.Forms.Padding(5, 4, 5, 4)
        Me.Name = "DeptDailySalesFRM"
        Me.Text = "Daily Sales By Department"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents mondayLBL As Label
    Friend WithEvents tuesdayLBL As Label
    Friend WithEvents wednesdayLBL As Label
    Friend WithEvents thursdayLBL As Label
    Friend WithEvents fridayLBL As Label
    Friend WithEvents monTBX As TextBox
    Friend WithEvents tueTBX As TextBox
    Friend WithEvents wedTBX As TextBox
    Friend WithEvents thuTBX As TextBox
    Friend WithEvents friTBX As TextBox
    Friend WithEvents totalDescLBL As Label
    Friend WithEvents subTotalsBTN As Button
    Friend WithEvents clearDataBTN As Button
    Friend WithEvents addBTN As Button
    Friend WithEvents outLBX As ListBox
    Private WithEvents deptCBO As ComboBox
    Friend WithEvents totalLBL As Label
End Class
