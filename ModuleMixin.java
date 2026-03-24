package com.example.translation.mixin;

import com.example.translation.Translations;
import meteordevelopment.meteorclient.systems.modules.Module;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Module.class)
public abstract class ModuleMixin {

    @Inject(method = "getName", at = @At("RETURN"), cancellable = true)
    private void onGetName(CallbackInfoReturnable<String> cir) {
        String original = cir.getReturnValue();
        String translated = Translations.translateModule(original);
        cir.setReturnValue(translated);
    }

    @Inject(method = "getTitle", at = @At("RETURN"), cancellable = true)
    private void onGetTitle(CallbackInfoReturnable<String> cir) {
        String original = cir.getReturnValue();
        String translated = Translations.translateModule(original);
        cir.setReturnValue(translated);
    }
}