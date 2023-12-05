Option Strict On
Imports System.IO
Public Class Form1
    Dim teams As Team() = New Team(9) {}  ' An array of Team objects
    Private teamCount As Integer = 0      ' The number of Teams added to teams()
    Private allPositions As String() = {"Centre", "Forward", "Defense", "Goalie", "Roamer"}
    Private allDivisions As String() = {"Premier", "Division 1", "Division 2", "Division 3", "Novice"}
    Private Sub MakeATeamFRM_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        LoadTeamsBTN.Enabled = False
        populateComboBox(leagueCBO, allDivisions)
        populateComboBox(pos1CBO, allPositions)
        ' Populate the other three ComboBoxes (pos2CBX, pos3CBX, pos4CBX) here
        populateComboBox(pos2CBO, allPositions)
        populateComboBox(pos3CBO, allPositions)
        populateComboBox(pos4CBO, allPositions)
        ClearTextBoxes()
    End Sub
    Private Sub makeTeamBTN_Click(sender As Object, e As EventArgs) Handles makeTeamBTN.Click
        Dim players As Player() = New Player(3) {}
        Dim teamName As String = teamNameTBX.Text
        Dim league As String = leagueCBO.Text
        If name1TBX.Text.Equals("") And name1TBX.Text.Equals("") And name1TBX.Text.Equals("") And name1TBX.Text.Equals("") Then
            MessageBox.Show("You must specify at least one player for your team.", "Invalid Team")
        Else
            ' Create player objects, players(0), players(1), players(2), players(3).  
            ' Only create Player(i) if the player's associated TextBox is not empty.
            If Not name1TBX.Text.Equals("") Then players(0) = New Player(name1TBX.Text, pos1CBO.Text, dob1DTP.Value)
            If Not name2TBX.Text.Equals("") Then players(1) = New Player(name2TBX.Text, pos2CBO.Text, dob2DTP.Value)
            If Not name3TBX.Text.Equals("") Then players(2) = New Player(name3TBX.Text, pos3CBO.Text, dob3DTP.Value)
            If Not name4TBX.Text.Equals("") Then players(3) = New Player(name4TBX.Text, pos4CBO.Text, dob4DTP.Value)
            teams(teamCount) = New Team(teamName, league, players)
            teamCount = teamCount + 1
            teamLBX.Items.Add(teamName)
            If teamCount = 10 Then makeTeamBTN.Enabled = False
            ClearTextBoxes()
        End If
    End Sub
    Sub populateComboBox(cbx As ComboBox, sa As String()) ' DO NOT MODIFY
        For i = 0 To sa.GetUpperBound(0)
            cbx.Items.Add(sa(i))
        Next
    End Sub
    Private Sub teamLBX_SelectedIndexChanged(sender As Object, e As EventArgs) Handles teamLBX.SelectedIndexChanged
        ' DO NOT MODIFY Procedure
        Dim teamIndex As Integer = teamLBX.SelectedIndex
        outTBX.Text = teams(teamIndex).TeamSummary
    End Sub
    Private Sub ClearTextBoxes() ' DO NOT MODIFY Procedure
        name1TBX.Text = ""
        name2TBX.Text = ""
        name3TBX.Text = ""
        name4TBX.Text = ""
        teamNameTBX.Text = ""
    End Sub
    Private Sub BrowseBTN_Click(sender As Object, e As EventArgs) Handles BrowseBTN.Click

        Dim openFileDialog As New OpenFileDialog()
        openFileDialog.Filter = "Text files (*.txt)|*.txt|All files (*.*)|*.*"
        If openFileDialog.ShowDialog() = DialogResult.OK Then
            TeamFilePathTXT.Text = openFileDialog.FileName
        End If
    End Sub
    Private Sub LoadTeamsBTN_Click(sender As Object, e As EventArgs) Handles LoadTeamsBTN.Click
        teamCount = 0
        If File.Exists(TeamFilePathTXT.Text) Then
            Dim file As System.IO.StreamReader = My.Computer.FileSystem.OpenTextFileReader(TeamFilePathTXT.Text)
            Dim line As String
            While Not file.EndOfStream
                line = file.ReadLine()
                Dim parts As String() = line.Split(","c)
                Dim teamName As String = parts(0)
                Dim league As String = parts(1)
                Dim players As New List(Of Player)

                For i As Integer = 2 To parts.Length - 1 Step 3
                    Dim playerName As String = parts(i)
                    Dim playerDOB As Date
                    Dim playerPosition As String = parts(i + 2)
                    Dim newPlayer As New Player(playerName, playerPosition, playerDOB)
                    players.Add(newPlayer)
                Next
                Dim newTeam As New Team(teamName, league, players.ToArray())
                teams(teamCount) = newTeam
                teamCount += 1
                If teamCount = 10 Then makeTeamBTN.Enabled = False
                teamLBX.Items.Add(teamName)
            End While
            file.Close()
            populateComboBox(leagueCBO, allDivisions)
            populateComboBox(pos1CBO, allPositions)
            populateComboBox(pos2CBO, allPositions)
            populateComboBox(pos3CBO, allPositions)
            populateComboBox(pos4CBO, allPositions)
            ClearTextBoxes()
        Else
            MessageBox.Show("The File " & TeamFilePathTXT.Text & " Does not Exist", "invalid file name")
            TeamFilePathTXT.Focus()
            TeamFilePathTXT.SelectAll()
        End If
    End Sub
    Private Sub TeamFilePathTXT_TextChanged(sender As Object, e As EventArgs) Handles TeamFilePathTXT.TextChanged
        If String.IsNullOrEmpty(TeamFilePathTXT.Text) Then
            LoadTeamsBTN.Enabled = False
        Else
            LoadTeamsBTN.Enabled = True
        End If
    End Sub

End Class
