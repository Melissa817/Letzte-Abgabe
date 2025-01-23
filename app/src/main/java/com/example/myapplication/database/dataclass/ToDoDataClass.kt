package com.example.myapplication.database.dataclass

/**
 * DataClass for an Tasks-Object
 */
data class ToDoDataClass (
        val id: Int = 0,
        val name: String,
        val priority: String,
        val endDate: String,
        val description: String,
        val status: Int
)