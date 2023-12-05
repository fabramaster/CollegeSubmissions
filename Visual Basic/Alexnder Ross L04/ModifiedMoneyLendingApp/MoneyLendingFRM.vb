Option Strict On
Public Class MoneyLendingFRM

    Private Sub loanAmountTBX_TextChanged(sender As Object, e As EventArgs) Handles loanAmountTBX.TextChanged
        DisplayBox.Text = "Term          Monthly payment"
        Button1.Enabled = True


    End Sub

    Private Sub NumericUpDown1_ValueChanged(sender As Object, e As EventArgs) Handles MinUpDown.ValueChanged
        Dim value As Integer = CInt(MinUpDown.Text)
        Dim value1 As Integer = CInt(MaxUpDown.Text)
        DisplayBox.Clear()
        DisplayBox.Text = "Term          Monthly payment"

        If value >= value1 Then
            MinUpDown.Value = MaxUpDown.Value


        End If

    End Sub

    Private Sub NumericUpDown2_ValueChanged(sender As Object, e As EventArgs) Handles MaxUpDown.ValueChanged
        DisplayBox.Clear()
        DisplayBox.Text = "Term          Monthly payment"

    End Sub



    Private Sub RadioButton1_CheckedChanged(sender As Object, e As EventArgs) Handles SignBonus.CheckedChanged
        PictureBox1.ImageLocation = "images\Money.png"
    End Sub

    Private Sub RadioButton2_CheckedChanged(sender As Object, e As EventArgs) Handles OnePercentDiscount.CheckedChanged
        PictureBox1.ImageLocation = "images\Percent.png"
    End Sub

    Private Sub RadioButton3_CheckedChanged(sender As Object, e As EventArgs) Handles Edmonton.CheckedChanged
        PictureBox1.ImageLocation = "images\Edmonton.png"
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim T1, T2, T22, T3, v, payments As Double
        Dim index As Integer = 0
        T1 = Double.Parse(loanAmountTBX.Text)
        T2 = Integer.Parse(MinUpDown.Text)
        T22 = Integer.Parse(MaxUpDown.Text)
        T3 = Double.Parse(intRateTBX.Text)
        index = CInt(T2) - 1
        DisplayBox.Text = "Term          Monthly payment"
        If SignBonus.Checked = True Then
            Do
                Index += 1
                payments = (Pmt(T3 / 12 / 100, index * 12, -(T1 - 1000)))
                v = Math.Round(payments, 2)
                DisplayBox.Text &= (Environment.NewLine & index & vbTab & "$" & v)


            Loop Until Index = T22

        ElseIf OnePercentDiscount.Checked = True Then
            Do
                index += 1
                payments = (Pmt((T3 - 1) / 12 / 100, index * 12, -T1))
                v = Math.Round(payments, 2)
                DisplayBox.Text &= (Environment.NewLine & index & vbTab & "$" & v)


            Loop Until index = T22
        Else
            Do
                index += 1
                payments = (Pmt(T3 / 12 / 100, index * 12, -T1))
                v = Math.Round(payments, 2)
                DisplayBox.Text &= (Environment.NewLine & index & vbTab & "$" & v)
            Loop Until index = T22
        End If
    End Sub



End Class
