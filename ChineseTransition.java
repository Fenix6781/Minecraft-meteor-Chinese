package com.example.translation;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChineseTranslation implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("meteor-chinese");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Meteor Chinese Translation 已加载");
    }
}