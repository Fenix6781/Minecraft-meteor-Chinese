package com.example.translation.mixin;

import com.example.translation.Translations;
import meteordevelopment.meteorclient.systems.modules.Category;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Category.class)
public class CategoryMixin {

    @Inject(method = "getName", at = @At("RETURN"), cancellable = true)
    private void onGetName(CallbackInfoReturnable<String> cir) {
        String original = cir.getReturnValue();
        String translated = Translations.translateCategory(original);
        cir.setReturnValue(translated);
    }
}