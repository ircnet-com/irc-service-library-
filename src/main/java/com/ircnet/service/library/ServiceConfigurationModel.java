package com.ircnet.service.library;

import com.ircnet.common.library.configuration.ConfigurationModel;
import com.ircnet.common.library.configuration.IRCServerModel;

import java.util.List;

/**
 * Contains the configuration of the service.
 */
public class ServiceConfigurationModel implements ConfigurationModel {
    /**
     * This is the name of the service as configured in the S line.
     */
    private String serviceName;

    /**
     * This is the distribution mask for this connection.
     */
    private String distributionMask;

    /**
     * This is the service type as configured in the S line.
     * The service type is a bit mask which defines what information the service can see and they are allowed to do.
     */
    private int serviceType;

    /**
     * It is a subset of the service type. It defines what kind of information the service wants to receive for
     * this particular connection.
     *
     * This mask can also have the following bits set, regardless of what the S line setting is:
     *
     * SERVICE_WANT_PREFIX     0x10000  to receive nick!user@host instead of nick
     * SERVICE_WANT_TOKEN      0x20000  use server token instead of name
     * SERVICE_WANT_EXTNICK    0x40000  user extended NICK syntax
     * SERVICE_WANT_UID        0x80000  user extended UID syntax
     */
    private int dataFlags;

    /**
     * It is optional. It is a subset of "dataFlags" that defines which information the service wants to receive in a
     * "connection burst". The information is similar to a server "connection burst", it describe the current set
     * of the network. The service can therefore store the information in memory and update it.
     */
    private int burstFlags;

    /**
     *  This is a short description of the service. It will be sent in "SERVLIST".
     */
    private String info;

    /**
     * This is the password as configured in the S line.
     */
    private String password;

    /**
     * Contains information about the irc servers to connect to.
     */
    List<IRCServerModel> ircServers;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDistributionMask() {
        return distributionMask;
    }

    public void setDistributionMask(String distributionMask) {
        this.distributionMask = distributionMask;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public int getDataFlags() {
        return dataFlags;
    }

    public void setDataFlags(int dataFlags) {
        this.dataFlags = dataFlags;
    }

    public int getBurstFlags() {
        return burstFlags;
    }

    public void setBurstFlags(int burstFlags) {
        this.burstFlags = burstFlags;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public List<IRCServerModel> getIrcServers() {
        return ircServers;
    }

    public void setIrcServers(List<IRCServerModel> ircServers) {
        this.ircServers = ircServers;
    }

    @Override
    public String getLocalAddress() {
        return null;
    }

    @Override
    public boolean isAutoConnectEnabled() {
        return true;
    }

    @Override
    public String getUserId() {
        return serviceName;
    }
}
