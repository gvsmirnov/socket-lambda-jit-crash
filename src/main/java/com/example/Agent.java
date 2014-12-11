package com.example;

import io.netty.channel.nio.NioEventLoopGroup;

import java.lang.instrument.Instrumentation;

public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        new NioEventLoopGroup();
    }
}
