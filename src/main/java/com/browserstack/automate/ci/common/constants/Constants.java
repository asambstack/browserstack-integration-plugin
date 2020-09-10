package com.browserstack.automate.ci.common.constants;

import jenkins.model.Jenkins;

public class Constants {
    public static final String BROWSERSTACK_REPORT_DISPLAY_NAME = "BrowserStack Test Report";
    public static final String BROWSERSTACK_LOGO = String.format("%s/plugin/browserstack-integration/images/logo.png", Jenkins.RESOURCE_PATH);
    public static final String BROWSERSTACK_REPORT_URL = "testReportBrowserStack";

    public static final String NAME = "name";
    public static final String BROWSER = "browser";
    public static final String OS = "os";
    public static final String OS_VERSION = "osVersion";
    public static final String STATUS = "status";
    public static final String USER_MARKED = "userMarked";
    public static final String DURATION = "duration";
    public static final String CREATED_AT = "createdAt";
    public static final String URL = "url";

    public static final class SessionStatus {
        public static final String RUNNING = "running";
        public static final String ERROR = "error";
        public static final String FAILED = "failed";
        public static final String UNMARKED = "unmarked";
    }
}
