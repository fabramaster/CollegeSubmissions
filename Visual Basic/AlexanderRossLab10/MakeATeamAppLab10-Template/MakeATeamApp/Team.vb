Public Class Team
    Private v_name As String
    Private v_league As String
    Private v_members As Player()
    Public Sub New(n As String, l As String, m As Player())
        TeamName = n
        League = l
        v_members = m
    End Sub
    Public Property TeamName As String
        Get
            Return v_name
        End Get
        Set(value As String)
            v_name = value
        End Set
    End Property
    Public Property League As String
        Get
            Return v_league
        End Get
        Set(value As String)
            v_league = value
        End Set
    End Property
    Public ReadOnly Property Members As String
        Get
            Dim s As String = ""
            For i = 0 To v_members.GetUpperBound(0)
                If Not v_members(i) Is Nothing Then
                    s = s & v_members(i).Summary & vbNewLine
                End If
            Next
            Return s
        End Get
    End Property
    Public ReadOnly Property TeamSummary As String
        Get
            Return "Team '" & TeamName & "' (League: " & League & ")" &
                    vbNewLine & vbNewLine &
                    "Members:" & vbNewLine & Members
        End Get
    End Property
End Class
