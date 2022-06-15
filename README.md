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

### Immersive UX
- My own little "Live-Coding" Plugin :)
  - Quickfixes for a series of tasks: adopt Lombok, migrate to AssertJ, ...
  - Display Cognitive Complexity
  - Visual effects & presentation speed optimization
  - QuickImport: assertThat... + 30 more

------------



## Part 2 - Refactoring 

### Parameters.java
- Refactor: **Change Method signature** + default value
- Refactor: **Introduce Parameter** to parameterize function for broader use
- Refactor: **Inline Parameter 💪** - if all callers pass the same constant
- Trick: Replace Parameter with query if all callers pass same thing
- Refactor: **Introduce Parameter Object** (new or reuse class)
- Refactor: **Introduce Functional Parameter**
- Trick: Add/remove param via Alt-ENTER
- Trick: Define duplicated Local to then remove redundant parameter

### Method
- Refactor: **Extract + Parameterize Method** for reuse
- Refactor Combo: **Extract over > Inline inner** (note: extract just the if )
- Refactor Combo: **Extract + Move Method** into Parameter or Dependency

### Fields
- Refactor: **Extract / Inline field** - ❗ Keep state short-lived
- Refactor: **Encapsulate Fields**

### Local Variables
- Refactor: **Extract explanatory variable**
- Trick: suggests extract expression under cursor
- Refactor: **Split Variable** to keep semantic sharp

### Classes
- Refactor: **Extract Delegate** 
  - in a lower-level service or
  - in a deeper structure (ie. deeper Domain Model)
- Refactor: **Extract / Inline Interface**

### Inspections (see BooleanLogic.java)
Hundreds. That teach you best practices.
- Move return closer
- Move variable definition closer to usages
- for to .stream()
- Run inspection on whole project
- Want **more inspections**? Download my (opinionated) Aggressive_Refactoring.xml
from https://victorrentea.ro
