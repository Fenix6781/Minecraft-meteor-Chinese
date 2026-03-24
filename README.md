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
│   │   ├── ChineseTranslation.java          # 模组主类
│   │   ├── Translations.java                # 翻译映射表
│   │   └── mixin/
│   │       ├── ModuleMixin.java             # 模块名替换
│   │       └── CategoryMixin.java           # 类别名替换
│   └── resources/
│       ├── fabric.mod.json
│       ├── mixins.chinese.json
│       └── assets/
│           └── chinese-translation/
│               └── icon.png                 # 可选图标
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
