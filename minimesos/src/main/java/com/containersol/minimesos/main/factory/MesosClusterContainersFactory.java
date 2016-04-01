package com.containersol.minimesos.main.factory;

import com.containersol.minimesos.cluster.Marathon;
import com.containersol.minimesos.cluster.MesosCluster;
import com.containersol.minimesos.cluster.MesosClusterFactory;
import com.containersol.minimesos.cluster.ZooKeeper;
import com.containersol.minimesos.marathon.MarathonContainer;
import com.containersol.minimesos.mesos.*;

/**
 * Docker based factory of minimesos cluster members
 */
public class MesosClusterContainersFactory extends MesosClusterFactory {

    @Override
    public ZooKeeper createZooKeeper(MesosCluster mesosCluster, String uuid, String containerId) {
        return new ZooKeeperContainer(mesosCluster, uuid, containerId);
    }

    @Override
    public MesosAgent createMesosAgent(MesosCluster mesosCluster, String uuid, String containerId) {
        return new MesosAgent(mesosCluster, uuid, containerId);
    }

    @Override
    public MesosMaster createMesosMaster(MesosCluster mesosCluster, String uuid, String containerId) {
        return new MesosMaster(mesosCluster, uuid, containerId);
    }

    @Override
    public Marathon createMarathon(MesosCluster mesosCluster, String uuid, String containerId) {
        return new MarathonContainer(mesosCluster, uuid, containerId);
    }

    @Override
    public Consul createConsul(MesosCluster mesosCluster, String uuid, String containerId) {
        return new Consul(mesosCluster, uuid, containerId);
    }

    @Override
    public Registrator createRegistrator(MesosCluster mesosCluster, String uuid, String containerId) {
        return new Registrator(mesosCluster, uuid, containerId);
    }

}
