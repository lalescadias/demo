package com.amigoscode.exemplo;

import java.util.Objects;

public class SoftwareEngineer {
    private String name;
    private int id;
    private String techStack;

    public SoftwareEngineer() {
    }

    public SoftwareEngineer(String name, int id, String techStack) {
        this.name = name;
        this.id = id;
        this.techStack = techStack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        result = prime * result + ((techStack == null) ? 0 : techStack.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SoftwareEngineer other = (SoftwareEngineer) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        if (techStack == null) {
            if (other.techStack != null)
                return false;
        } else if (!techStack.equals(other.techStack))
            return false;
        return true;
    }

}
