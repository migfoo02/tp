package seedu.application.testutil;

import seedu.application.model.job.*;

/**
 * A utility class to help with building Job objects.
 */
public class JobBuilder {

    public static final String DEFAULT_ROLE = "Student";
    public static final String DEFAULT_COMPANY = "Sparkletots";
    public static final String DEFAULT_DEADLINE = Deadline.TO_ADD_DEADLINE;
    public static final String DEFAULT_STATUS = Status.IN_PROGRESS;

    private Role role;
    private Company company;
    private Deadline deadline;
    private Status status;

    /**
     * Creates a {@code JobBuilder} with the default details.
     */
    public JobBuilder() {
        role = new Role(DEFAULT_ROLE);
        company = new Company(DEFAULT_COMPANY);
        deadline = new Deadline(DEFAULT_DEADLINE);
        status = new Status(DEFAULT_STATUS);
    }

    /**
     * Initializes the JobBuilder with the data of {@code jobToCopy}.
     */
    public JobBuilder(Job jobToCopy) {
        role = jobToCopy.getRole();
        company = jobToCopy.getCompany();
        deadline = jobToCopy.getDeadline();
        status = jobToCopy.getStatus();
    }

    /**
     * Sets the {@code role} of the {@code Job} that we are building.
     */
    public JobBuilder withRole(String role) {
        this.role = new Role(role);
        return this;
    }

    /**
     * Sets the {@code Company} of the {@code Job} that we are building.
     */
    public JobBuilder withCompany(String company) {
        this.company = new Company(company);
        return this;
    }

    /**
     * Sets the {@code Deadline} of the {@code Job} that we are building.
     */
    public JobBuilder withDeadline(String deadline) {
        this.deadline = new Deadline(deadline);
        return this;
    }

    /**
     * Sets the {@code Company} of the {@code Job} that we are building.
     */
    public JobBuilder withStatus(String status) {
        this.status = new Status(status);
        return this;
    }

    public Job build() {
        return new Job(role, company, deadline, status);
    }

}
