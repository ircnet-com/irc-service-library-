package com.ircnet.service.library.events;

import com.ircnet.service.library.IRCService;
import com.ircnet.service.library.connection.IRCServiceConnection;

public class TopicEvent extends AbstractServiceEvent {
    private String channelName;
    private String topic;
    private String from;

    public TopicEvent(IRCService ircService, IRCServiceConnection ircConnection, String channelName, String topic) {
        this.ircService = ircService;
        this.ircConnection = ircConnection;
        this.channelName = channelName;
        this.topic = topic;
    }

    public TopicEvent(IRCService ircService, IRCServiceConnection ircConnection, String channelName, String topic, String from) {
        this(ircService, ircConnection, channelName, topic);
        this.from = from;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getTopic() {
        return topic;
    }

    public String getFrom() {
        return from;
    }
}
