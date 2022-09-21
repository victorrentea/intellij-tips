#IntelliJ Tricks
by Victor Rentea, Software Crafter and Trainer
https://victorrentea.ro

17 years of java, 9 years of trainings
Huge Community: https://victorrentea.ro/community

Git: https://github.com/victorrentea/intellij-tips.git
Branch: master
Video Courses, Personal or Company Training

## Part 1 - Coding Speed (see the recording at https://victorrentea.ro/#talks)

### Auto-Completion
- Contains: person.first 
- First letters: person.gfn
- Statics (CTRL-SPACE x 2): ctm, assertEquals
- ALT-ENTER in autocomplete suggestion > import static method
- TAB completion (overwriting)
- **Compatible type suggesions** (CTRL-SHIFT-SPACE || ^⌥Space)

### Templates
- Live Templates: main, sout
  - CUSTOM: pf, logs
- Postfix Expansion: .sout .if .for .return
  - CUSTOM: .assertThat, .log ($EXPR$.log) 

### Faster Typing
- **Complete Current Statement** (CTRL-SHIFT-ENTER :: ⇧⌘Enter)
  - if, method, class
  - wrap call around eg Optional.ofNullable`
- **Multi-cursor** (ALT-J :: ^G); F3=skip; CTRL-ALT-SHIFT-J=all (demo on enum)
  - Also: Alt-Drag and Alt-Shift-Click+Click...
- Surround with (CTRL-ALT-T :: ⌥⌘T): if, try
- Embrace Selection (&more): while text is selected, press any of: {"'`<([
- Expand Selection (CTRL-W :: ⌥ ↑)
- Quick Fix (ALT-ENTER :: ⌥ ⏎):
  - Define Variable for expression
  - Define new type/method
  - Add parameters
  - Delete dead code
  - 100+ more 😊
 
### Navigation 
- Call hierarchy (CTRL-ALT-H :: ^⌥H)
- Go to last edit place (CTRL-SHIFT-Backspace)
- Bookmarks (F11 :: F3)
- Next Occurrence of Token (F3 :: ⌘G)
- Quick Definition (Ctrl-Shift-I :: ⌥ Space)
- Show parameters (Ctrl-P) 
- Show type of current expression (Ctrl-Shift-P)
- Clipboard History (CTRL-SHIFT-V :: ⇧⌘V)

- Distraction Free (Ctrl-Alt-Shift-F12)
  - Alt-# for views
- Back/Forward (CTRL-ALT-LEFT/RIGHT :: ⌘[ / ⌘])
- Recent Files (CTRL-E :: ⌘E)
- Recent Locations (CTRL-SHIFT-E)
- CamelHumps on CTRL-LEFT/RIGHT

### Learning Shortcuts
- "KeyPromoterX" plugin

