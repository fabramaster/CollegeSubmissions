Option Strict On
Public Class Applicant
    Private _ApplicantName As String
    Private _DateOfBirth As Date
    Private _AccountNumber As Integer
    Private _Assets As Asset()
    Public Sub New(applicantName As String, accountNumber As Integer, dateOfBirth As Date, assets As Asset())
        Me.ApplicantName = applicantName
        Me.DateOfBirth = dateOfBirth
        Me.AccountNumber = accountNumber
        Me._Assets = assets
    End Sub
    Public Property ApplicantName() As String
        Get
            Return _ApplicantName
        End Get
        Set(ByVal value As String)
            _ApplicantName = value
        End Set
    End Property
    Public Property DateOfBirth() As Date
        Get
            Return _DateOfBirth
        End Get
        Set(ByVal value As Date)
            If value <= DateTime.Now Then _DateOfBirth = value
        End Set
    End Property
    Public Property AccountNumber() As Integer
        Get
            Return _AccountNumber
        End Get
        Set(ByVal value As Integer)
            _AccountNumber = value
        End Set
    End Property
    Public ReadOnly Property ApplicantSummary() As String
        Get
            Dim summary As String = ""
            summary = Me.ApplicantName & " (Account No.: " & Me.AccountNumber & ")"
            summary += Environment.NewLine & Environment.NewLine
            summary += "Assets:" & Environment.NewLine
            Dim i As Integer
            For i = 0 To Me._Assets.Length - 1
                If Me._Assets(i) IsNot Nothing Then
                    Dim asset As Asset = Me._Assets(i)
                    summary += "   - " & asset.Summary()
                    If i < (Me._Assets.Length - 1) Then summary += Environment.NewLine
                End If
            Next
            Return summary
        End Get
    End Property

End Class
