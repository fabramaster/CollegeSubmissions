Option Strict On
Public Class DeptDailySalesFRM
    Private allDepartments As String()   ' Stores names of all departments
    Private depts As String()            ' Stores names of departments chosen by user (12 max)
    Private items As Integer = 0         ' Stores the number of departments the user picks
    Private allSales As Decimal(,)       ' Stores the sales for a department on a particular day
    Private dailyTotals(4) As Decimal    ' Stores the calculated total for each day
    Private deptTotals() As Decimal      ' Stores weekly totals for each department select by the user

    ' The DAYS constant is provided for your convenience
    Private DAYS As String

    'Form Initialization when it is loading
    Private Sub DeptDailySalesFRM_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        DAYS = String.Format("{0,16:S}{1,8:S}{2,8:S}{3,8:S}{4,8:S}",
                             "Mon", "Tue", "Wed", "Thu", "Fri")

        allDepartments = New String() {"Bakery", "Dairy", "Deli", "Floral",
                                       "Frozen", "Alcohol", "Grocery", "Meat",
                                       "Produce", "Seafood", "Pet", "Bulk"}

        depts = New String(allDepartments.Count - 1) {}
        deptTotals = New Decimal(allDepartments.Count - 1) {}

        outLBX.Items.Add(DAYS)
        deptCBO.Items.AddRange(allDepartments)

        ' 3 arrays have been instantiated for you - dailyTotals, allDepartments, and depts
        ' Instantiate the other two (allSales and deptTotals) here:
        clearDataBTN_Click(Me, Nothing)
    End Sub

    'Clear all the form components
    Private Sub clearDataBTN_Click(sender As Object, e As EventArgs) Handles clearDataBTN.Click
        'Remove all the items
        items = 0

        'Activate the first item of the combo
        deptCBO.SelectedIndex = 0

        'Clear all the Textbox and Labels
        monTBX.Text = ""
        tueTBX.Text = ""
        wedTBX.Text = ""
        thuTBX.Text = ""
        friTBX.Text = ""
        totalLBL.Text = ""

        'Reset the List and set the header
        outLBX.Items.Clear()
        outLBX.Items.Add(DAYS)

        'reset arrays of totals and selected depts
        allSales = New Decimal(allDepartments.Count - 1, 4) {}
        For ctrRow As Integer = 0 To allDepartments.Count - 1
            depts(ctrRow) = ""
            deptTotals(ctrRow) = 0

            For ctrCol As Integer = 0 To 4
                allSales(ctrRow, ctrCol) = 0
            Next
        Next

        For ctrCol As Integer = 0 To 4
            dailyTotals(ctrCol) = 0
        Next

        'Make enabled the ADD and Display Buttons
        addBTN.Enabled = True
        subTotalsBTN.Enabled = True
    End Sub


    'Add Button is clicked, Adding a new row to the listbox
    Private Sub addBTN_Click(sender As Object, e As EventArgs) Handles addBTN.Click
        Dim deptDataRow As String

        'Validate that all the textbox are not empties
        If monTBX.Text = "" Then
            monTBX.Text = "0"
        End If
        If tueTBX.Text = "" Then
            tueTBX.Text = "0"
        End If
        If wedTBX.Text = "" Then
            wedTBX.Text = "0"
        End If
        If thuTBX.Text = "" Then
            thuTBX.Text = "0"
        End If
        If friTBX.Text = "" Then
            friTBX.Text = "0"
        End If

        If deptCBO.SelectedIndex >= 0 Then
            'Fill departments
            depts(items) = deptCBO.Text

            'Fill allSales
            allSales(items, 0) = CDec(monTBX.Text)
            allSales(items, 1) = CDec(tueTBX.Text)
            allSales(items, 2) = CDec(wedTBX.Text)
            allSales(items, 3) = CDec(thuTBX.Text)
            allSales(items, 4) = CDec(friTBX.Text)

            'Update depTotals
            For ctrCol As Integer = 0 To 4
                deptTotals(items) += allSales(items, ctrCol)
            Next

            'Update dailyTotals
            dailyTotals(0) += allSales(items, 0)
            dailyTotals(1) += allSales(items, 1)
            dailyTotals(2) += allSales(items, 2)
            dailyTotals(3) += allSales(items, 3)
            dailyTotals(4) += allSales(items, 4)

            deptDataRow = String.Format("{0,-8:S}{1,8:S}{2,8:S}{3,8:S}{4,8:S}{5,8:S}",
                                        depts(items),
                                        String.Format("{0:0.00}", allSales(items, 0)),
                                        String.Format("{0:0.00}", allSales(items, 1)),
                                        String.Format("{0:0.00}", allSales(items, 2)),
                                        String.Format("{0:0.00}", allSales(items, 3)),
                                        String.Format("{0:0.00}", allSales(items, 4)))
            outLBX.Items.Add(deptDataRow)

            items += 1

            deptCBO.SelectedIndex = 0
            monTBX.Text = ""
            tueTBX.Text = ""
            wedTBX.Text = ""
            thuTBX.Text = ""
            friTBX.Text = ""
        End If
    End Sub

    'Display Subtotals Button clicked
    Private Sub subTotalsBTN_Click(sender As Object, e As EventArgs) Handles subTotalsBTN.Click
        Dim deptDataRow As String
        Dim totalValue As Decimal

        If items > 0 Then
            'Updating all the rows into the listbox
            For ctrRow As Integer = 0 To items

                deptDataRow = outLBX.Items(ctrRow).ToString

                If ctrRow = 0 Then
                    deptDataRow += String.Format("{0,12:S}", "Totals")
                Else
                    deptDataRow += String.Format("{0,12:S}", String.Format("{0:$0.00}", deptTotals(ctrRow - 1)))
                    totalValue += deptTotals(ctrRow - 1)
                End If

                outLBX.Items(ctrRow) = deptDataRow
            Next

            'Adding a new row with daily totals
            deptDataRow = String.Format("{0,16:C2}{1,8:C2}{2,8:C2}{3,8:C2}{4,8:C2}",
                                        String.Format("{0:$0.00}", dailyTotals(0)),
                                        String.Format("{0:$0.00}", dailyTotals(1)),
                                        String.Format("{0:$0.00}", dailyTotals(2)),
                                        String.Format("{0:$0.00}", dailyTotals(3)),
                                        String.Format("{0:$0.00}", dailyTotals(4)))
            outLBX.Items.Add(deptDataRow)

            'Making disabled the buttons Add new item and display subtotals
            totalLBL.Text = String.Format("{0:$0.00}", totalValue)

            subTotalsBTN.Enabled = False
            addBTN.Enabled = False
        End If
    End Sub
End Class
