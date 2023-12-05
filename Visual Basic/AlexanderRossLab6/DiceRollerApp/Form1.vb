Option Strict On
Public Class Form1

    Dim randGen As New Random
    Private Sub Form1_Load(sender As System.Object, e As System.EventArgs) Handles MyBase.Load
        TwoDieRBN.Checked = True
    End Sub
    Private Sub RadioButton1_CheckedChanged(sender As Object, e As EventArgs) Handles OneDieRBN.CheckedChanged
        PictureBox1.Visible = True
        PictureBox2.Visible = False
        PictureBox3.Visible = False
        PictureBox4.Visible = False
        PictureBox1.Location = New Point(131, 94)
        PictureBox1.Size = New Drawing.Size(160, 160)
        PictureBox1.Image = Image.FromFile("images/dieFooBar.png")
        ImagesReset()
    End Sub

    Private Sub RadioButton2_CheckedChanged(sender As Object, e As EventArgs) Handles TwoDieRBN.CheckedChanged
        PictureBox1.Visible = True
        PictureBox2.Visible = True
        PictureBox3.Visible = False
        PictureBox4.Visible = False
        PictureBox1.Location = New Point(21, 36)
        PictureBox2.Location = New Point(281, 155)
        PictureBox1.Size = New Drawing.Size(160, 160)
        PictureBox2.Size = New Drawing.Size(160, 160)
        PictureBox1.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox2.Image = Image.FromFile("images/dieFooBar.png")
        ImagesReset()

    End Sub

    Private Sub RadioButton3_CheckedChanged(sender As Object, e As EventArgs) Handles ThreeDieRBN.CheckedChanged
        PictureBox1.Visible = True
        PictureBox2.Visible = True
        PictureBox3.Visible = True
        PictureBox4.Visible = False
        PictureBox1.Location = New Point(17, 36)
        PictureBox2.Location = New Point(166, 107)
        PictureBox3.Location = New Point(321, 192)
        PictureBox1.Size = New Drawing.Size(120, 120)
        PictureBox2.Size = New Drawing.Size(120, 120)
        PictureBox3.Size = New Drawing.Size(120, 120)
        PictureBox1.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox2.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox3.Image = Image.FromFile("images/dieFooBar.png")
        ImagesReset()
    End Sub

    Private Sub RadioButton4_CheckedChanged(sender As Object, e As EventArgs) Handles FourDieRBN.CheckedChanged
        PictureBox1.Visible = True
        PictureBox2.Visible = True
        PictureBox3.Visible = True
        PictureBox4.Visible = True
        PictureBox1.Location = New Point(50, 58)
        PictureBox2.Location = New Point(275, 58)
        PictureBox3.Location = New Point(50, 192)
        PictureBox4.Location = New Point(275, 192)
        PictureBox1.Size = New Drawing.Size(110, 110)
        PictureBox2.Size = New Drawing.Size(110, 110)
        PictureBox3.Size = New Drawing.Size(110, 110)
        PictureBox4.Size = New Drawing.Size(110, 110)
        PictureBox1.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox2.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox3.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox4.Image = Image.FromFile("images/dieFooBar.png")
        ImagesReset()
    End Sub
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles RollDieBTN.Click
        Dim numDice As Integer
        Select Case True

            Case OneDieRBN.Checked
                numDice = 1
            Case TwoDieRBN.Checked
                numDice = 2
            Case ThreeDieRBN.Checked
                numDice = 3
            Case FourDieRBN.Checked
                numDice = 4
        End Select

        RollDice(numDice)



    End Sub
    Function RollDice(ByRef n As Integer) As Integer
        Dim dice1 As Integer = randGen.Next(0, 6) + 1
        Dim dice2 As Integer = randGen.Next(0, 6) + 1
        Dim dice3 As Integer = randGen.Next(0, 6) + 1
        Dim dice4 As Integer = randGen.Next(0, 6) + 1

        Select Case n
            Case 1

                diceGBX.Text = "you rolled a total of " & dice1
            Case 2
                diceGBX.Text = "you rolled a total of " & (dice1 + dice2)
            Case 3
                diceGBX.Text = "you rolled a total of " & (dice1 + dice2 + dice3)
            Case 4
                diceGBX.Text = "you rolled a total of " & (dice1 + dice2 + dice3 + dice4)
        End Select

        Select Case dice1
            Case 1
                PictureBox1.Image = Image.FromFile("images/die1.png")
            Case 2
                PictureBox1.Image = Image.FromFile("images/die2.png")
            Case 3
                PictureBox1.Image = Image.FromFile("images/die3.png")
            Case 4
                PictureBox1.Image = Image.FromFile("images/die4.png")
            Case 5
                PictureBox1.Image = Image.FromFile("images/die5.png")
            Case 6
                PictureBox1.Image = Image.FromFile("images/die6.png")
        End Select
        Select Case dice2
            Case 1
                PictureBox2.Image = Image.FromFile("images/die1.png")
            Case 2
                PictureBox2.Image = Image.FromFile("images/die2.png")
            Case 3
                PictureBox2.Image = Image.FromFile("images/die3.png")
            Case 4
                PictureBox2.Image = Image.FromFile("images/die4.png")
            Case 5
                PictureBox2.Image = Image.FromFile("images/die5.png")
            Case 6
                PictureBox2.Image = Image.FromFile("images/die6.png")
        End Select
        Select Case dice3
            Case 1
                PictureBox3.Image = Image.FromFile("images/die1.png")
            Case 2
                PictureBox3.Image = Image.FromFile("images/die2.png")
            Case 3
                PictureBox3.Image = Image.FromFile("images/die3.png")
            Case 4
                PictureBox3.Image = Image.FromFile("images/die4.png")
            Case 5
                PictureBox3.Image = Image.FromFile("images/die5.png")
            Case 6
                PictureBox3.Image = Image.FromFile("images/die6.png")
        End Select
        Select Case dice4
            Case 1
                PictureBox4.Image = Image.FromFile("images/die1.png")
            Case 2
                PictureBox4.Image = Image.FromFile("images/die2.png")
            Case 3
                PictureBox4.Image = Image.FromFile("images/die3.png")
            Case 4
                PictureBox4.Image = Image.FromFile("images/die4.png")
            Case 5
                PictureBox4.Image = Image.FromFile("images/die5.png")
            Case 6
                PictureBox4.Image = Image.FromFile("images/die6.png")
        End Select
    End Function
    Private Sub ImagesReset()
        PictureBox1.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox2.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox3.Image = Image.FromFile("images/dieFooBar.png")
        PictureBox4.Image = Image.FromFile("images/dieFooBar.png")
        diceGBX.Text = "Roll The Dice "
    End Sub


    Private Sub diceGBX_Enter(sender As Object, e As EventArgs) Handles diceGBX.Enter

    End Sub
    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles PictureBox1.Click

    End Sub
    Private Sub PictureBox2_Click(sender As Object, e As EventArgs) Handles PictureBox2.Click

    End Sub

    Private Sub PictureBox3_Click(sender As Object, e As EventArgs) Handles PictureBox3.Click

    End Sub

    Private Sub PictureBox4_Click(sender As Object, e As EventArgs) Handles PictureBox4.Click

    End Sub


End Class
