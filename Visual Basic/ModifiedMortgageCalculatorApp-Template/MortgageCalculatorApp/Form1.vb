Option Strict On
Public Class Form1
    Private Sub amountTBX_TextChanged(sender As Object, e As EventArgs) Handles amountTBX.TextChanged
        TextBox1.Clear()
        TextBox1.Text = "Term          Payments" & vbNewLine
    End Sub

    Private Sub interestTBX_TextChanged(sender As Object, e As EventArgs) Handles interestTBX.TextChanged
        TextBox1.Clear()
        TextBox1.Text = "Term          Payments" & vbNewLine
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim Amount, Rate, IntrestRate, numberPayments As Double
        Dim fiveyear, tenyear, twentyfiveyear, fiftyyear As String
        If amountTBX.Text = String.Empty Then
            MessageBox.Show("Enter an amount and a interest rate", "Invalid Data")
        ElseIf interestTBX.Text = String.Empty Then
            MessageBox.Show("Enter an amount and a interest rate", "Invalid Date")
        Else
            Amount = Double.Parse(amountTBX.Text)
            Rate = Double.Parse(interestTBX.Text)
            IntrestRate = Rate / 12
            'If Checked Then output '
            If five.Checked = True Then
                fiveyear = CStr(Pmt(IntrestRate / 100, 5 * 12, -Amount))
                TextBox1.Text &= " 5 years:        $" & CStr(Math.Round(CDbl(fiveyear), 2)) & vbNewLine
            End If
            If ten.Checked = True Then
                tenyear = CStr(Pmt(IntrestRate / 100, 10 * 12, -Amount))
                TextBox1.Text &= "10 years:       $" & CStr(Math.Round(CDbl(tenyear), 2)) & vbNewLine
            End If
            If twentyfive.Checked = True Then
                twentyfiveyear = CStr(Pmt(IntrestRate / 100, 25 * 12, -Amount))
                TextBox1.Text &= "25 years:       $" & CStr(Math.Round(CDbl(twentyfiveyear), 2)) & vbNewLine
            End If
            If fifty.Checked = True Then
                fiftyyear = CStr(Pmt(IntrestRate / 100, 50 * 12, -Amount))
                TextBox1.Text &= "50 years:       $" & CStr(Math.Round(CDbl(fiftyyear), 2)) & vbNewLine
            End If
        End If

    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        TextBox1.Text = "Term          Payments" & vbNewLine
    End Sub
End Class

