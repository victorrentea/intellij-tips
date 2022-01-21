#IntelliJ Tricks
by Victor Rentea, Software Crafter and Trainer
https://victorrentea.ro
17 years of java, 9 years of trainings
Community: https://victorrentea.ro/community

Video Courses, Personal or Company Training

### Auto-Completion
- Contains: person.first 
- First letters: person.gfn
- Over-dot completion: p.gfn, S.ctm()
- Statics (CTRL-SPACE x 2): ctm, assertEquals
- ALT-ENTER in autocomplete suggestion > import static method
- TAB completion (overwriting)
- Boilerplate generation (vs ALT-INS): get/set/toString/hashCode
- **Compatible type suggesions** (CTRL-SHIFT-SPACE || ^⌥Space)
    - x2 = Chain Completion (one dot deep); eg timeBased(_)

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

### Java8/Stream support
- ALT-Enter on .stream <--> for
- Collecting: ctl, cs, cj
- Skip ".stream()"...
- Fix "effectively final" with "Avoid mutation" quick fix

### Inspections
- Hundreds. That teach you coding practices.
- Aggressive_Refactoring.xml   at  https://drive.google.com/file/d/1yBviYXPGtGe7ZNYJoaKxh8e1Yxzcr1el/view?usp=sharing
- Run inspection on ...
- Move variable definition closer to usages
- Move return closer
  
### Immersive UX

- My own little "Live-Coding" Plugin :)
  - Shake your world
  - Cognitive Complexity
  - Lombok: @RAC @Slf4J
  - QuickImport: assertThat... + 30 more


Note: Mac: ⌥ = "Option", ^ = "Ctrl"