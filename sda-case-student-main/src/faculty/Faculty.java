package faculty;

import courses.Course;

public abstract class Faculty {
    protected String name;

    public Faculty(String name) {
        this.name = name;
    }

    public abstract void assignToCourse(Course course);
}
