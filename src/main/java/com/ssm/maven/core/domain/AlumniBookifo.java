package com.ssm.maven.core.domain;


public class AlumniBookifo {
    private Integer abId;

    private String abName;

    private Integer gradeId;

    private Integer classId;

    private String abDescription;
    
    private Models models;

    public Models getModels() {
		return models;
	}

	public void setModels(Models models) {
		this.models = models;
	}

	public Integer getAbId() {
        return abId;
    }

    public void setAbId(Integer abId) {
        this.abId = abId;
    }

    public String getAbName() {
        return abName;
    }

    public void setAbName(String abName) {
        this.abName = abName == null ? null : abName.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getAbDescription() {
        return abDescription;
    }

    public void setAbDescription(String abDescription) {
        this.abDescription = abDescription == null ? null : abDescription.trim();
    }
}