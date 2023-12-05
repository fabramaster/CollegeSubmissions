Option Strict On
Public Class LoanApplicationFRM
    Private loanApps As Applicant()    ' An array of Applicant objects
    Private nameList As String()       ' An array of the applicant names 
    Private appCount As Integer = 0    ' The number of Applicants added to loanApps
    Private Const MAX_APPLICANTS = 10  ' The maximum number of applicatants

    Private Sub LoanApplicationFRM_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        loanApps = New Applicant(MAX_APPLICANTS - 1) {}
        nameList = New String(MAX_APPLICANTS - 1) {}
    End Sub

    Private Sub addBTN_Click(sender As Object, e As EventArgs) Handles addBTN.Click
        Dim name As String = nameTBX.Text
        Dim acc As Integer = CInt(accountNoTBX.Text)
        Dim dob As Date = dobDTP.Value
        Dim assetList(2) As Asset

        ' Populate the array of assets (assetList(0), assetList(1), assetList(2)) using the Asset TextBox data. 
        ' Only create Assets if the associated TextBox is NOT empty 
        If asset1DescTBX.Text <> String.Empty And asset1ValueTBX.Text <> String.Empty Then
            Dim asset1 As New Asset(asset1DescTBX.Text, Convert.ToDecimal(asset1ValueTBX.Text))
            assetList(0) = asset1
        End If
        If asset2DescTBX.Text <> String.Empty And asset2ValueTBX.Text <> String.Empty Then
            Dim asset2 As New Asset(asset2DescTBX.Text, Convert.ToDecimal(asset2ValueTBX.Text))
            assetList(1) = asset2
        End If
        If asset3DescTBX.Text <> String.Empty And asset3ValueTBX.Text <> String.Empty Then
            Dim asset3 As New Asset(asset3DescTBX.Text, Convert.ToDecimal(asset3ValueTBX.Text))
            assetList(2) = asset3
        End If

        'Clear the text boxes
        nameTBX.Text = String.Empty
        accountNoTBX.Text = String.Empty
        dobDTP.Value = DateTime.Now
        asset1DescTBX.Text = String.Empty
        asset1ValueTBX.Text = String.Empty
        asset2DescTBX.Text = String.Empty
        asset2ValueTBX.Text = String.Empty
        asset3DescTBX.Text = String.Empty
        asset3ValueTBX.Text = String.Empty
        summaryTBX.Text = String.Empty
        nameTBX.Focus()

        ' Create the Applicant object using the Applicant data assetList array and 
        ' add it to the loanApps array at index, appCount.
        loanApps(appCount) = New Applicant(name, acc, dob, assetList)
        nameList(appCount) = name
        appCount += 1

        ' Update the DataSource of the ComboBox using the update loanApps array
        applicantCBO.DataSource = Nothing
        applicantCBO.DataSource = nameList
    End Sub

    Private Sub applicantCBO_SelectedIndexChanged(sender As Object, e As EventArgs) Handles applicantCBO.SelectedIndexChanged
        ' All code for this event handler should be within this If statement
        If Not applicantCBO.DataSource Is Nothing Then
            Dim idx As Integer = applicantCBO.SelectedIndex
            summaryTBX.Text = loanApps(idx).ApplicantSummary
        End If
    End Sub

End Class
