package com.ssm.maven.core.domain;


public class Models {
    private Integer modelsId;

    private String indexpage;

    private String teacherpage;

    private String studentpage;

    private String tailpage;

    private String pictrue;

    private String descrip;

    public Integer getModelsId() {
        return modelsId;
    }

    public void setModelsId(Integer modelsId) {
        this.modelsId = modelsId;
    }

    public String getIndexpage() {
        return indexpage;
    }

    public void setIndexpage(String indexpage) {
        this.indexpage = indexpage == null ? null : indexpage.trim();
    }

    public String getTeacherpage() {
        return teacherpage;
    }

    public void setTeacherpage(String teacherpage) {
        this.teacherpage = teacherpage == null ? null : teacherpage.trim();
    }

    public String getStudentpage() {
        return studentpage;
    }

    public void setStudentpage(String studentpage) {
        this.studentpage = studentpage == null ? null : studentpage.trim();
    }

    public String getTailpage() {
        return tailpage;
    }

    public void setTailpage(String tailpage) {
        this.tailpage = tailpage == null ? null : tailpage.trim();
    }

    public String getPictrue() {
        return pictrue;
    }

    public void setPictrue(String pictrue) {
        this.pictrue = pictrue == null ? null : pictrue.trim();
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip == null ? null : descrip.trim();
    }
}