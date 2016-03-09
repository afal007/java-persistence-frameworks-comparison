package com.clevergang.dbtests.model;

/**
 * @author Bretislav Wajtr <bretislav.wajtr@clevergang.com>
 */
public class Department {
    private Integer pid;
    private Integer department_pid;
    private String name;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentPid() {
        return department_pid;
    }

    public void setDepartmentPid(Integer department_pid) {
        this.department_pid = department_pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Department that = (Department) o;

        if (pid != null ? !pid.equals(that.pid) : that.pid != null)
            return false;
        if (department_pid != null ? !department_pid.equals(that.department_pid) : that.department_pid != null)
            return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (department_pid != null ? department_pid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
            "pid=" + pid +
            ", department_pid=" + department_pid +
            ", name='" + name + '\'' +
            '}';
    }
}

