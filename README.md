#IntelliJ Tricks by Victor Rentea, Software Crafter and Trainer

# Me
- Doing workshops for companies throughout the world.
https://victorrentea.ro

- 17 years of java, 9 years of trainings and consultancy

- Founder of the 2nd largest Software Crafter Community 
on Meetup.com (5K devs):
Join us 👉 https://victorrentea.ro/community


# Hi, DevTernity !

## First day driving ...

## Exploratory Refactoring

### Typing
- Autocompletion: person.firstName > person.fn > p.fn
- Boilerplate: toString
- Type-aware / snake-completion: MaritalStatus  
- Postfix Completion: .sout .log .assertThat
- Live Templates: boot, logs
- TAB completion
- Statics (CTRL-SPACE x 2): ctm

### Wrapping
- Finish Statement (CTRL-SHIFT-ENTER :: ⇧⌘Enter) 
  - if, method, class
  - method call: ofNullable(
  - Wrap generics: Optional<
- Surround with (CTRL-ALT-T :: ⌥⌘T): if, try
- Embrace Selection: while text is selected, press any of: {"'`<([

### Smart Selecting
- Multi-cursor
  - token-based (ALT-J :: ^G) -- MovieType .html 
  - ALT-drag -- .feature
  - ALT-SHIFT + click, click
- Expand/Contract selection

### 👑 Quick Fix (aka Inspections) 
(ALT-ENTER :: ⌥ ⏎):
- Define Variable for expression
- Define new type/method
- Delete dead code
- Syntax-Tree analysis: see Boolean Logic
- Run inspection on entire project -- String.valueOf
- and 500+ more 😊=> almost all are disabled by default
    
### FP Support
- ALT-Enter on .stream <-> for
- Skip writing ".stream()"
- Autocomplete after directly after ::  
- Collecting: ctl, cs, cj

### Code inspection / Surviving Legacy
- Quick Definition (Ctrl-Shift-I :: ⌥ Space)
- Current Parameter (Ctrl-P)
- Type of current expression (Ctrl-Shift-P)
- Call hierarchy (CTRL-ALT-H :: ^⌥H)
- Recent Files (CTRL-E :: ⌘E) 
- Recent Places/Changes (CTRL-SHIFT-E)
- Bookmark (F11 :: F3)
- Collapse / Fold (CTRL-. :: ⌘.)

### Refactoring
- Introduce Parameter, Functional Parameter, and Parameter Object -- Parameters.java
- Add param from inside / from outside w/ ALT-ENTER 

- Extract Method (+ Auto-Parameterize) -- ExtractMethod.java
- Combo: Extract over & Inline inner
- Combo: Extract & Move/Convert to Instance

- Extract / Inline / Encapsulate Field -- Fields.java 
- Extract explanatory variable (w or w/o preselecting)
- Extract / Inline Interface


### Next Steps
- Become a Shortcuts Ninja 🥷: install "Key Promoter X" plugin
- Practice all the moves yourself (pause-play this)
  
- More Inspections: Download my (opinionated) inspections list
  (search Aggressive_Refactoring.xml on https://victorrentea.ro)
- In-house workshop your company won't ever forget  
  mailto:victorrentea@gmail.com

- Join my Community of Software Crafters (>5000 members) 
for monthly live webinars and hot🔥 debates