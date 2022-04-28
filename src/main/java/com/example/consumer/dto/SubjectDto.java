package com.example.consumer.dto;



public class SubjectDto {
    private int subjectId;
    private String name;
    private int semester;
    private int credits;
    private Short status;

    public SubjectDto() {
    }

    public SubjectDto(int subjectId, String name, int semester, int credits, Short status) {
        this.subjectId = subjectId;
        this.name = name;
        this.semester = semester;
        this.credits = credits;
        this.status = status;
    }


    public int getSubjectId() {
        return this.subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Short getStatus() {
        return this.status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

   

    @Override
    public String toString() {
        return "{" +
            ", name='" + getName() + "'" +
            ", semester='" + getSemester() + "'" +
            ", credits='" + getCredits() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }


}
