package com.example.insert_viewall

data class Employee (var em_post:String,var em_dept:String,var em_salary:Int)
{
    var em_id:Int=0
    constructor(em_id:Int,em_post:String,em_dept: String,em_salary: Int):this(em_post, em_dept, em_salary)
    {
        this.em_id = em_id
    }
}