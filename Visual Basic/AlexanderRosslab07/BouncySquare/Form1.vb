Public Class Form1
    Dim xLocation As Integer = 0
    Dim yLocation As Integer = 0
    Dim xDirection As Integer = 1
    Dim yDirection As Integer = 1
    Dim stepCount As Integer = 1
    Const WIDTH As Integer = 51
    Const HEIGHT As Integer = 23

    Private Sub runBTN_Click(sender As Object, e As EventArgs) Handles runBTN.Click
        If runBTN.Text = "Run" Then
            runBTN.Text = "Pause"
            bounceTMR.Enabled = True
        Else
            runBTN.Text = "Run"
            bounceTMR.Enabled = False
        End If
    End Sub
    Private Sub sizeNUD_ValueChanged(sender As Object, e As EventArgs) Handles sizeNUD.ValueChanged
        drawSquare(sizeNUD.Value, xLocation, yLocation)
    End Sub
    Private Sub stepNUD_ValueChanged(sender As Object, e As EventArgs) Handles stepNUD.ValueChanged
        stepCount = stepNUD.Value
    End Sub
    Private Sub bounceTMR_Tick(sender As Object, e As EventArgs) Handles bounceTMR.Tick
        xLocation += xDirection * stepCount
        yLocation += yDirection
        If xLocation + sizeNUD.Value >= WIDTH Then
            xDirection = -1
        ElseIf xLocation <= 0 Then
            xDirection = 1
        End If
        If yLocation + sizeNUD.Value >= HEIGHT Then
            yDirection = -1
        ElseIf yLocation <= 0 Then
            yDirection = 1
        End If
        drawSquare(sizeNUD.Value, xLocation, yLocation)
    End Sub
    Private Sub drawSquare(sqSize As Integer, x As Integer, y As Integer)
        Dim boxString As String = ""
        For i As Integer = 0 To HEIGHT - 1
            For j As Integer = 0 To WIDTH - 1
                If i >= y AndAlso i < y + sqSize AndAlso j >= x AndAlso j < x + sqSize Then
                    boxString += "X"
                Else
                    boxString += " "
                End If
            Next
            boxString += Environment.NewLine
        Next
        outTBX.Text = boxString
    End Sub
    Private Sub slowRBN_CheckedChanged(sender As Object, e As EventArgs) Handles slowRBN.CheckedChanged
        bounceTMR.Interval = 500
    End Sub
    Private Sub fastRBN_CheckedChanged(sender As Object, e As EventArgs) Handles fastRBN.CheckedChanged
        bounceTMR.Interval = 200
    End Sub

    Private Sub turboRBN_CheckedChanged(sender As Object, e As EventArgs) Handles turboRBN.CheckedChanged
        bounceTMR.Interval = 50
    End Sub
End Class