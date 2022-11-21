In general, what is an adapter? - Adapters are very common in everyday life, for example, when buying devices from Apple - sometimes you can get a charger with a 110 W plug, but we have 220 W, of course, an adapter comes to the rescue. 
The adapter allows these two objects to work together. It is the same in programming, if you want interfaces to work together, you need to use an adapter template. 
However, it would be more correct to say that it is to convert one interface to another that an adapter is needed. For normal work, inheritance and polymorphism will be enough.

Models:
- Scout Drone
- Combat Drone
- Drone Operator

Actions:
- Scout Drone - flying and scouting
- Combat Drone - flying and shooting (but this drone also can scout, because it has cameras)
- Drone Operator - flying and scouting by drones

Task:
- To combine drones actions, combat drone - can scout with action find target
(it is finding target to shoot it, and scout drone just scouting, but combat drone also can scout)

Diagram classes is in repo img
All Classes are in source repo
