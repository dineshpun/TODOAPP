package com.example.todomvvm.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "todos")
public  class Todo {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String description;
    private int priority;
    private String todo_date;
    private String todo_time;
    @ColumnInfo(name = "updated_at")
    private Date updatedAt;


    public Todo(int id, String description, int priority, Date updatedAt, String todo_date, String todo_time) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.todo_date = todo_date;
        this.todo_time = todo_time;
    }

    @Ignore
    public Todo(String description, int priority, Date updatedAt, String todo_date, String todo_time) {
        this.description = description;
        this.priority = priority;
        this.updatedAt = updatedAt;
        this.todo_date = todo_date;
        this.todo_time = todo_time;
    }

    public int getId() {
        return id;
    }

    public String getTodo_date() {
        return todo_date;
    }

    public void setTodo_date(String todo_date) {
        this.todo_date = todo_date;
    }

    public String getTodo_time() {
        return todo_time;
    }

    public void setTodo_time(String todo_time) {
        this.todo_time = todo_time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
