package com.containersol.minimesos.config

import groovy.util.logging.Slf4j

@Slf4j
class MesosMasterConfig extends MesosContainerConfig {

    public static final String MESOS_MASTER_IMAGE = "containersol/mesos-master"
    public static final int MESOS_MASTER_PORT = 5050

    public MesosMasterConfig(String mesosVersion) {
        imageName = MESOS_MASTER_IMAGE
        imageTag = mesosVersion + "-" + MINIMESOS_DOCKER_TAG
    }

    boolean authenticate = false
    String aclJson

}
