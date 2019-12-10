package af.asr.discovery.hazelcast;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig{
    @Bean
    public Config hazelCastConfig(){
        Config config = new Config();
        config.setInstanceName("hazelcast-instance")
                .addMapConfig(
                        new MapConfig()
                                .setName("configuration")
                                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                .setEvictionPolicy(EvictionPolicy.LRU)
                                .setTimeToLiveSeconds(-1));
        return config;
    }

//    @Bean
//    public Config hazelcastConfig() {
//        Config config = new Config();
//        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
//        config.getNetworkConfig().getJoin().getEurekaConfig()
//                .setEnabled(true)
//                .setProperty("self-registration", "true")
//                .setProperty("namespace", "hazelcast");
//        return config;
//    }


//    @Bean
//    public Config hazelcastConfig(EurekaClient eurekaClient) {
//        EurekaOneDiscoveryStrategyFactory.setEurekaClient(eurekaClient);
//        Config config = new Config();
//        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
//        config.getNetworkConfig().getJoin().getEurekaConfig()
//                .setEnabled(true)
//                .setProperty("self-registration", "true")
//                .setProperty("namespace", "hazelcast")
//                .setProperty("use-metadata-for-host-and-port", "true");
//        return config;
//    }


//    @Bean
//    public Config hazelcast() {
//        MapConfig eventStoreMap = new MapConfig("spring-boot-admin-event-store")
//                .setInMemoryFormat(InMemoryFormat.OBJECT)
//                .setBackupCount(1)
//                .setEvictionPolicy(EvictionPolicy.NONE)
//                .setMergePolicyConfig(new MergePolicyConfig(PutIfAbsentMapMergePolicy.class.getName(), 100));
//
//        MapConfig sentNotificationsMap = new MapConfig("spring-boot-admin-application-store")
//                .setInMemoryFormat(InMemoryFormat.OBJECT)
//                .setBackupCount(1)
//                .setEvictionPolicy(EvictionPolicy.LRU)
//                .setMergePolicyConfig(new MergePolicyConfig(PutIfAbsentMapMergePolicy.class.getName(), 100));
//
//        Config config = new Config();
//        config.addMapConfig(eventStoreMap);
//        config.addMapConfig(sentNotificationsMap);
//        config.setProperty("hazelcast.jmx", "true");
//
//        config.getNetworkConfig()
//                .getJoin()
//                .getMulticastConfig()
//                .setEnabled(false);
//        TcpIpConfig tcpIpConfig = config.getNetworkConfig()
//                .getJoin()
//                .getTcpIpConfig();
//        tcpIpConfig.setEnabled(true);
//        tcpIpConfig.setMembers(Collections.singletonList("127.0.0.1"));
//        return config;
//    }
}