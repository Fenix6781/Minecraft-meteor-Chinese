Meteor Chinese Translation

https://img.shields.io/badge/Minecraft-1.21.10-green.svg
https://img.shields.io/badge/Fabric-0.15.11-blue.svg
https://img.shields.io/badge/Meteor_Client-0.5.x-orange.svg
https://img.shields.io/badge/License-MIT-blue.svg

为 Meteor Client 提供完整中文支持的 Fabric 扩展模组。通过 Mixin 技术直接替换模块、类别和设置项的显示文本，解决原版 Meteor 无法正确显示中文的问题。

---

✨ 特性

· 全面汉化：覆盖战斗、玩家、移动、渲染、世界、杂项等所有类别的模块名称。
· Mixin 注入：直接替换 Meteor 内部字符串，不依赖原版语言文件，兼容性更强。
· 轻量高效：仅替换文本，无额外性能开销。
· 易于扩展：翻译映射表独立维护，可轻松添加或修正翻译。

---

📥 安装

1. 确保已安装 Minecraft 1.21.10、Fabric Loader 0.15.11+ 和 Meteor Client 0.5.x。
2. 从 Releases 页面下载最新版本的 .jar 文件。
3. 将 .jar 放入 .minecraft/mods 文件夹。
4. 启动游戏，享受中文界面。

---

🛠️ 构建

如果你想自行编译或修改，请按以下步骤操作：

环境要求

· Java 21
· Git（可选）

步骤

1. 克隆仓库：
   ```bash
   git clone https://github.com/Fenix6781/Minecraft-meteor-Chinese.git
   cd Minecraft-meteor-Chinese
   ```
2. 修改 gradle.properties 中的版本号（如需适配其他 Minecraft 版本）：
   ```properties
   minecraft_version = 1.21.10
   meteor_version = 0.5.2
   ```
3. 构建模组：
   ```bash
   ./gradlew build
   ```
4. 生成的 .jar 文件位于 build/libs/ 目录。

---

📁 文件结构

```
meteor-chinese-translation/
├── src/main/
│   ├── java/com/example/translation/
│   │   ├── ChineseTranslation.java          
│   │   ├── Translations.java                
│   │   └── mixin/
│   │       ├── ModuleMixin.java             
│   │       └── CategoryMixin.java           
│   └── resources/
│       ├── fabric.mod.json
│       ├── mixins.chinese.json
│       └── assets/
│           └── chinese-translation/
│               └── icon.png                 
├── build.gradle
├── gradle.properties
├── settings.gradle
└── README.md
```

---

📝 翻译映射表维护

翻译映射表位于 src/main/java/com/example/translation/Translations.java 的静态代码块中。你可以根据需要添加或修改词条：

```java
MODULE_NAMES.put("English Name", "中文名称");
CATEGORY_NAMES.put("Category", "类别");
```

当前已包含的模块（部分）

英文名 中文名
Auto Mine 自动挖矿
Crystal Aura 水晶光环
Auto Totem 自动换图腾
Auto Eat 饿了就吃
Freecam 灵魂出窍
Flight 飞行
Speed 加速
Kill Aura 杀光环
ESP 透视
X-Ray 方块透视
... ...

完整映射表可在 Translations.java 中查看，目前包含 200+ 条常见模块。

---

🤝 贡献指南

欢迎提交 Issue 和 Pull Request 来完善翻译！

如何贡献

1. Fork 本仓库。
2. 在 Translations.java 中修改或添加词条。
3. 确保编译通过（运行 ./gradlew build）。
4. 提交 Pull Request，并描述你的改动。

翻译规范

· 模块名尽量保持简短、准确。
· 类别名使用常见游戏术语（如“战斗”、“移动”）。
· 若遇到英文缩写（如 ESP），可保留或使用中文惯用名。

---

📄 许可证

本项目使用 MIT 许可证。详情请见 LICENSE 文件。

---

🙏 致谢

· Meteor Client – 优秀的 Minecraft 实用工具。
· Fabric – 模组加载平台。
· 所有参与汉化的贡献者。

---

祝你游戏愉快！ 🎮
