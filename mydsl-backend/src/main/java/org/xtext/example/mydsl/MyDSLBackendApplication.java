package org.xtext.example.mydsl;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyDSLBackendApplication extends Application<MyDSLBackendConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyDSLBackendApplication().run(args);
    }

    @Override
    public String getName() {
        return "mydsl-backend";
    }

    @Override
    public void initialize(final Bootstrap<MyDSLBackendConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MyDSLBackendConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
