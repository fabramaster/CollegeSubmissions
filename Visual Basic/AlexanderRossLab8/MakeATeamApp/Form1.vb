Option Strict On
Public Class Form1
    Dim teams As Team() = New Team(9) {}  ' An array of Team objects
    Private teamCount As Integer = 0      ' The number of Teams added to teams()
    Private allPositions As String() = {"Centre", "Forward", "Defense", "Goalie", "Roamer"}
    Private allDivisions As String() = {"Premier", "Division 1", "Division 2", "Division 3", "Novice"}
    Private Sub MakeATeamFRM_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        populateComboBox(leagueCBO, allDivisions)
        populateComboBox(pos1CBO, allPositions)
        populateComboBox(pos2CBX, allPositions)
        populateComboBox(pos3CBX, allPositions)
        populateComboBox(pos4CBX, allPositions)
    End Sub
    Sub populateComboBox(cbx As ComboBox, sa As String()) ' DO NOT MODIFY
        For i = 0 To sa.GetUpperBound(0)
            cbx.Items.Add(sa(i))
        Next
    End Sub
    Private Sub makeTeamBTN_Click(sender As Object, e As EventArgs) Handles makeTeamBTN.Click
        Dim teamName As String = teamNameTBX.Text
        Dim league As String = leagueCBO.Text
        Dim player1 As Player
        Dim player2 As Player
        Dim player3 As Player
        Dim player4 As Player
        ' Create player objects based on the non-empty textboxes
        If Not String.IsNullOrEmpty(name1TBX.Text) Then
            player1 = New Player(name1TBX.Text, pos1CBO.Text, dob1DTP.Value)
        End If
        If Not String.IsNullOrEmpty(name2TBX.Text) Then
            player2 = New Player(name2TBX.Text, pos2CBX.Text, dob2DTP.Value)
        End If
        If Not String.IsNullOrEmpty(name3TBX.Text) Then
            player3 = New Player(name3TBX.Text, pos3CBX.Text, dob3DTP.Value)
        End If
        If Not String.IsNullOrEmpty(name4TBX.Text) Then
            player4 = New Player(name4TBX.Text, pos4CBX.Text, dob4DTP.Value)
        End If
        ' Check if no players were added
        If player1 Is Nothing AndAlso player2 Is Nothing AndAlso player3 Is Nothing AndAlso player4 Is Nothing Then
            MessageBox.Show("You must specify at least one player for your team")
            Return ' Exit the method without creating a new team
        End If
        ' Create player array with only non-empty players
        Dim players As Player() = {player1, player2, player3, player4}.Where(Function(p) p IsNot Nothing).ToArray()
        teams(teamCount) = New Team(teamName, league, players)
        teamCount = teamCount + 1
        teamLBX.Items.Add(teamName)
        If teamCount = 10 Then makeTeamBTN.Enabled = False
        ClearTextBoxes()
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
End Class
Public Class Player
    Private _name As String
    Private _position As String
    Private _dob As Date
    Public Sub New(name As String, position As String, dob As Date)
        _name = name
        _position = position
        _dob = dob
    End Sub
    Public ReadOnly Property PlayerName As String
        Get
            Return _name
        End Get
    End Property
    Public ReadOnly Property Position As String
        Get
            Return _position
        End Get
    End Property
    Public ReadOnly Property DOB As String
        Get
            Return _dob.ToString("MMMM dd, yyyy")
        End Get
    End Property
    Public ReadOnly Property Summary As String
        Get
            Return $"{_name} ({_position}, {DOB})"
        End Get
    End Property
End Class
Public Class Team
    Private _teamName As String
    Private _league As String
    Private _players As Player()

    Public Sub New(teamName As String, league As String, players As Player())
        _teamName = teamName
        _league = league
        _players = players
    End Sub
    Public ReadOnly Property TeamName As String
        Get
            Return _teamName
        End Get
    End Property
    Public ReadOnly Property League As String
        Get
            Return _league
        End Get
    End Property
    Public ReadOnly Property Players As Player()
        Get
            Return _players
        End Get
    End Property
    Public ReadOnly Property TeamSummary As String
        Get
            Dim summary As String = "Team Name: " & _teamName & vbCrLf
            summary &= "League: " & _league & vbCrLf
            summary &= "Players:" & vbCrLf
            For i = 0 To _players.Length - 1
                If _players(i) IsNot Nothing Then
                    summary &= "   " & _players(i).Summary & vbCrLf
                End If
            Next
            Return summary
        End Get
    End Property

End Class
