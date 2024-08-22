package software.vandaele.icu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
    
public class ICUClient implements ClientModInitializer {

    public static final String MOD_ID = "icu";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
    @Override
    public void onInitializeClient() {
        LOGGER.info("I see you!");
		BlockRenderLayerMap.INSTANCE.putBlock(Blocks.BARRIER, RenderLayer.getTranslucent());
    }

}