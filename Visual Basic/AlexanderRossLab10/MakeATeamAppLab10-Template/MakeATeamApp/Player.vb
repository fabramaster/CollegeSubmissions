Public Class Player
    Private v_name As String
    Private v_position As String
    Private v_DOB As Date
    Public Sub New(n As String, p As String, d As Date)
        PlayerName = n
        Position = p
        v_DOB = d
    End Sub
    Public Property PlayerName As String
        Get
            Return v_name
        End Get
        Set(value As String)
            v_name = value
        End Set
    End Property
    Public Property Position As String
        Get
            Return v_position
        End Get
        Set(value As String)
            v_position = value
        End Set
    End Property
    Public ReadOnly Property DOB As String
        Get
            Return String.Format("{0:MMMM dd, yyyy}", v_DOB)
        End Get
    End Property
    Public ReadOnly Property Summary As String
        Get
            Return PlayerName & " (" & Position & ", " & DOB & ")"
        End Get
    End Property

End Class
