# CMPSC 100-03 Lab Session 8: G. Wiz Runs for Office: Part 2
* Assigned: 28 October 2019
* Due: 4 November 2019
* Point value: 45 pts

In this laboratory session, we explore topics including: 

* The difference between `while` and `for` loops in practice/application
* More about working with `reference types`
* Working with and creating methods and other program organization

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc100fall2019.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (& above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) reguarly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

If you have not already done so, I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:
* [Mastering markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)
* GitHub handouts distributed at the beginning of the lab session

As for a markdown cheatsheet, [this GitHub repository](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) serves as a useful online, single-page guide.

## G. Wiz runs for office: Part 2

Election Day approaches fast! Will G. Wiz be able to keep his campaign promise to implement a digital voting system at the pond? To summarize what we have done and what we have left:

But wouldn't you know it -- technology marches quickly along: we have some new methods to use to make the system work even more efficiently -- namely `for` loops. The spirit of progress doesn't stop there! G. Wiz forgot about a newly-passed local ordinance which allows voters to write candidates in on Election Day.

This assignment's goal is to revise the work you've already done and complete the system in total. When revising, consider:

* Why would one use a `for` vs. `while` loop?
* What new methods do you need to write for your files (`Ballot.java` and `Candidate.java`)
    * What's already there which can help you?
As a *stretch goal*, can you revise `Ballot.java`'s `searchCandidates` method to be more efficient?

### Review

`Completed`

* A `Ballot` object which:
    - [x] Has a complete `searchCandidates()` method to search `ArrayLists` by property of a `reference type`
    - [x] Only adds candidates one time
* A `Candidate` object whose:
    - [x] Constructor accepts a name and set it the object's `.name` property
    - [x] Method `getVotes` retrieves the amount of votes cast for the candidate
* A `RunElection` program which:
    - [x] Reads a file of candidate names
    - [x] Adds them to a ballot
    - [x] Displays that ballot to the screen

`To Do`

* A `Ballot` object which:
    * Contains a method called `castBallot` which adds the ability for voters to register their votes
        * In addition, this method should allow for candidates _not_ on the ballot to be written in
    * Contains a method called `getWinner` which finds and returns the `Candidate` with the maxiumum amount of votes
* A `Candidate` object which:
    * Contains a method titled `addVote` to increase a candidate's vote count by one each time it is called for a particular candidate
    * Implements a `toString` method which displays output in the following format printed to the screen: `{NAME}: {VOTE COUNT}`
* A `RunElection` program which:
    * Reads a file containing individual votes cast
    * Adds each of these votes to the `Ballot` object using the `castBallot` method of `Ballot`

## Required deliverables

A successful submission for this lab includes two (2) Java files and one (1) `reflection.md` file.

- [ ] The repository should have at least 5 commits

### `Ballot.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Revises the appropriate number of `while` loops into `for` loops
- [ ] Implements `castBallot` method which accepts write-in candidates and:
   * Returns nothing (a `void` return type)
   * Accepts 1 parameter which is a `String` (candidate name)
   * Uses the `.set` method of `ArrayList` to update the ballot
   * When handling write-ins:
       * Prints the name of the write-in to the screen in the following format: `WRITE-IN: {CANDIDATE'S NAME}`
       * Casts a ballot for the write-in
- [ ] Implements `getWinner` method to return the _maximum_ vote-getter as a `Candidate` object

Several of the above objectives will use methods from `Candidate.java` to complete them.

### `Candidate.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Implements a method named `addVote` which increases a candidate's vote count by one each time it is called
- [ ] Implements a `toString` method to return the `Candidate` object in the form `{NAME}: {VOTE COUNT}` (e.g. `G. Wiz: 0`)

### `RunElection.java`

- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Contains at least 10 single-line comments
- [ ] Contains at least 4 multi-line comments 
- [ ] Reads a file named `vote.tally` in the `input` directory
- [ ] Iterates over the file using a `while` loop to cast a ballot for the candidate read in
- [ ] Prints the final result of the ballot object
- [ ] Retrieves the winning `Candidate` object and prints it to the screen

The output should be _similar_ to:

```
WRITE-IN: {Write-in name}

Current ballot for pond representative:

Chompers              101
Wally Gator           102
Rango                 102
Leon Powalski         102
Croc. O. Dile         102
Ray Croc              102
G. Wiz                104
Randall Boggs         102
Slippy Toad           102
Frogger               100

WINNER: {Winner's Name and vote total}
```


### `reflection.md`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains at least 500 words
- [ ] Contains at least 10 headings
- [ ] Uses at least 3 code blocks
- [ ] Responds to _all_ questions

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`