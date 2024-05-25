const prompt = require("prompt-sync")();
let questions = [ ["A. expand energy, enjoy groups \tB. conserve energy, enjoy one-on-one", "E","I"], 
					["A. interprete literally \tB. look for meaning and possibilities","S","N"], 
					["A. logical, thinking, questioning, \tB. emphathetic, feeling, accomodating", "T","F"], 
					["A. organized, orderly, \tB. flexible, adaptable","J","P"],
					["A. more outgoing, thinking out loud, \tB. more reserved, think to yourself", "E","I"],
					["A. practical, realistic, experiental B. imaginative, innovative, theoretical","S", "N"],
					["A. candid, straight forward, frank \tB. tactful, kind,encouraging","T","F"],
					["A. plan, schedule \tB. unplanned, spontaneous", "J","P"],
					["A. seek many tasks, public activities, interaction with others \tB. seek private, solitary activities with quiet to concentrate","E","I"],
					["A. Standard, usual, conventional \tB. different, novel, unique", "S","N"],
					["A. firm, tend to critcize, hold the line \tB. gentle, tend to appreciate, concilate","T","F"],
					["A. regulated, structured \tB. easygoing, live, and let live","J","P"],
					["A. external, communicate, express yourself \tB. internal, recticent, keep to yourself", "E","I"],
					["A. focus on here and now \tB. look to the future, global, big picture", "S","N"],
					["A. tough-minded, just \tB. tenderhearted, merciful", "T", "F"],
					["A. preparation, plan ahead \tB. go with the flow, adapt as you go", "J","P"],
					["A. active, initiate \tB. reflective, deliberate", "E","I"],
					["A. facts, things, what is \tB. ideas, dreams, what could be, philosophical","S","N"],
					["A. matter of fact, issue-oriented  \tB. sensitive, people-oriented, compassionate", "T","F" ],
					["A. control, govern \tB. latitude, freedom", "J","P"]
					];

		let scores = [4];
		for(let i = 0; i < questions.length; i++) {
			console.log(questions[i][0]);
			console.log("\n")
			let response = prompt("Enter A or B as response:  ").toUpperCase()1;
			

			if ("A" === response &&  "E" === (questions[i][1]))  { scores[0]++;
			}else if ("B" === response &&  "I" === (questions[i][2]))  { scores[0]--;}

			if ("A" === response &&  "S" === (questions[i][1]))  { scores[1]++;
			}else if ("B" === response &&  "N" === (questions[i][2])) { scores[1]--;}

			if ("A" === response &&  "T" === (questions[i][1]))  { scores[2]++;
			}else if ("B" === response &&  "F" === (questions[i][2]))  { scores[2]--;}

			if ("A" === response &&  "J" === (questions[i][1]))  { scores[3]++;
			}else if ("B" === response &&  "P" === (questions[i][2]))  { scores[3]--;}

		}

	let mbtiType = "";

	if (scores[0] >= 0) { mbtiType += "E";}
	else { mbtiType += "I";}

	if (scores[1] >= 0) { mbtiType += "S";}
	else { mbtiType += "N";}

	if (scores[2] >= 0) { mbtiType += "T";}
	else { mbtiType += "F";}

	if (scores[3] >= 0) { mbtiType += "J";}
	else { mbtiType += "P";}

	console.log("Your MBTI personality is " +  mbtiType);

if(mbtiType === "INFJ") {
	console.log(` The INFJ personality type, known as the Advocate, is a rare gem in the world of personalities.
	         Comprising only about 1-2% of the population, INFJs possess a unique blend of traits that make them both mysterious and deeply impactful. 
	         At first glance, INFJs may appear reserved and quiet. But beneath their calm exterior lies a rich inner world.
		 They are introspective, constantly analyzing their thoughts and feelings. 
                 Their intuition guides them, allowing them to see patterns and connections that others miss. 
		INFJs are dreamers, visionaries, and seekers of meaning.
		`)
}

if(mbtiType === "ISTJ") {
	console.log(` Reliable and Responsible: ISTJs thrive in structured environments, meticulously following rules and procedures. 
		  They are the bedrock of dependability, ensuring tasks are executed consistently.
		  Detail-Oriented: Precision is their forte. ISTJs notice the minutiae that others overlook. Whether it’s proofreading a document, assembling intricate machinery, or organizing a cluttered space, their attention to detail ensures accuracy and order.
		  Loyal and Traditional: Tradition holds immense value for ISTJs. 
		  They honor commitments, respect established norms, and find comfort in time-tested practices.
		  Loyalty to family, institutions, and principles guides their decisions.
	          Introverted and Steady: ISTJs recharge in solitude. 
		  They appreciate routine and predictability.
		  Their steady pace, like a metronome, keeps life moving smoothly. While they may not seek the spotlight, their quiet contributions form the backbone of society.
}		  `)

if(mbtiType === "ISFJ") {
	console.log(` ISFJs feel a deep sense of responsibility to those around them. They meet deadlines, remember birthdays, and uphold traditions. Their loyalty extends beyond family and friends—it often encompasses their communities and employers.
Attention to Practical Details: ISFJs excel in practical matters. They give careful attention to everyday details, ensuring things run smoothly. Their analytical abilities and eye for detail make them reliable problem-solvers.
Generosity and Altruism: These altruists show kindness-in-excess. When someone needs help, ISFJs drop everything to lend a hand. Their energy is most replenished when they’re supporting others.
Challenges and Downsides: While their commitment is admirable, ISFJs may feel overworked or taken advantage of. Change can be difficult for them, especially sudden or unfamiliar changes.
In a world where kindness often goes unnoticed, ISFJs quietly make a difference. `)
}

if(mbtiType === "ISFP") {
	console.log(` ISFPs embody a free-spirited and artistic nature, dancing to their own rhythm:
Turbulent Adventurer (ISFP-T): These individuals thrive on creativity, spontaneity, and sensory experiences. They immerse themselves in the beauty of the present moment, often expressing themselves through art, music, or other forms of self-expression.
In a world where conformity can feel stifling, ISFPs color outside the lines, adding vibrancy to life’s `)
}

if(mbtiType == "INTJ" ) {
	console.log(` INTJs have an insatiable thirst for knowledge. They value creative ingenuity, straightforward rationality, and self-improvement. Their minds are never at rest, constantly analyzing everything around them.
Independent Thinkers: INTJs question most things, basing their beliefs on solid evidence, reasoning, and rationality. They don’t trust the status quo; instead, they prefer making their own discoveries and finding better ways of doing things.
Driven by Success: These tacticians bring a single-minded drive to their work. They apply insight, logic, and willpower to achieve their goals. Success matters to them, not just inventiveness.
Strong Independent Streak: INTJs don’t mind acting alone; in fact, they often prefer their own company. Their decisions are made without seeking input from others, which can sometimes come across as insensitive.`)
}

if(mbtiType === "ISTP") {
	console.log(` ISFPs are artists at heart. They express themselves through music, painting, or other creative outlets. Their sensitivity to aesthetics and emotions allows them to create beauty that resonates with others.`);
}
if(mbtiType === "INFP") {
	console.log(` INFPs are dreamers and idealists. They seek harmony and authenticity, often channeling their emotions into poetry, storytelling, or advocating for causes close to their hearts. Their empathy makes them natural healers.
}	`);
if (mbtiType === "INTP") {
	console.log(` INTPs are brilliant thinkers. They dissect complex problems, invent theories, and explore abstract concepts. Their minds are like intricate blueprints, constructing new ideas and challenging conventional wisdom.
	`);
}
if(mbtiType === "ESTP") {
	console.log(` ESTPs are action-oriented thrill-seekers. They live for the adrenaline rush, whether it’s through sports, adventure, or daring feats. Their charisma and spontaneity make them magnetic to others.
	`);
}
if(mbtiType === "ESFP") {
	console.log(` ESFPs light up any room they enter. They’re the life of the party, entertaining with their humor, dance moves, and infectious energy. Their zest for life inspires everyone around them.
	`);
}
//if(mbtiType === "ENFP") { 
	//console.log(` ENFPs are enthusiastic visionaries. They champion causes, rally people together, and ignite change. Their creativity knows no bounds, and they thrive on connecting with others.
	//`);
//}
if(mbtiType === "ENTP") { 
	console.log(` ENTPs are intellectual explorers. They question everything, challenge norms, and dive into debates. Their wit and curiosity lead them to innovative solutions and groundbreaking ideas.
	`);
}
if(mbtiType === "ESTJ") { 
	console.log(`  ESTJs are natural leaders. They organize, plan, and execute flawlessly. Their practicality and efficiency ensure that projects get done, teams stay on track, and goals are achieved.
	`);
}
if(mbtiType === "ESFJ") { 
	console.log(` ESFJs are nurturing caretakers. They put others’ needs first, creating a warm and supportive environment. Their attention to detail and social skills make them excellent hosts and friends.
	`);
}
if(mbtiType === "ENFJ") { 
	console.log(`  ENFJs inspire and guide. They mentor, uplift, and bring out the best in people. Their charisma and intuition allow them to connect deeply with others, fostering growth and understanding.
	`);
}
if(mbtiType === "ENTJ") { 
	console.log(` ENTJs are strategic leaders. They see the big picture, set ambitious goals, and mobilize teams to achieve them. Their determination and decisiveness propel them forward.
	`);
}













}
}
