package com.example.insert_viewall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_all.*

class ViewAllActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all)

        UpdateRecycler()
    }
    private fun UpdateRecycler() {
        var db=DBHelper(this)
        var arr=db.retriveAll()
        var employeeadapter = EmployeeAdapter(this,arr)
        myrecycle.adapter = employeeadapter
    }
}