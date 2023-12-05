Option Strict On
Public Class Asset
    Private _Description As String
    Private _AssetValue As Decimal
    Public Property Description() As String
        Get
            Return _Description
        End Get
        Set(ByVal value As String)
            _Description = value
        End Set
    End Property
    Public Property AssetValue() As Decimal
        Get
            Return _AssetValue
        End Get
        Set(ByVal value As Decimal)
            If value >= 0 Then _AssetValue = value
        End Set
    End Property
    Public Sub New(description As String, assetValue As Decimal)
        Me.Description = description
        Me.AssetValue = assetValue
    End Sub
    Public ReadOnly Property Summary() As String
        Get
            Return Me.Description & " (Value: " & Me.AssetValue.ToString("C") & ")"
        End Get
    End Property
End Class
