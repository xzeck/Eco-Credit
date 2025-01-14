# Eco Credit

<p align="center">
  <img width="120px" src="frontend/ecocredit/src/assets/images/logo.png" alt="Eco Credit Logo"/>
</p>

## Developed by: Group 1

| Name                     | Email                |
| ------------------------ | -------------------- |
| Avadh Rakholiya          | av786964@dal.ca      |
| Bhavya Mukesh Dave       | bh392017@dal.ca      |
| Christin Saji            | christin.saji@dal.ca |
| Geerthana Kanagalingame  | gr964904@dal.ca      |
| Raisa Gandi Putri        | rgputri@dal.ca       |
| Ajaykumar Premkumar Nair | ajay.nair@dal.ca     |

## Technical Stack

- Frontend:
  - React: `v18.2.0`
  - React Bootstrap: `v2.10.0`
  - Bootstrap: `v5.3.2`
  - Sass: `v1.70.0`
- Backend:
  - Java: `v21`
  - Spring Boot: `v3.2.2`
  - Maven

## Dependencies

### Frontend

| Dependency                          | Version | Purpose                                                                                                    |
| ----------------------------------- | ------- | ---------------------------------------------------------------------------------------------------------- |
| @fortawesome/fontawesome-svg-core   | 6.5.1   | Provides the core functionality for using Font Awesome icons in a React project.                           |
| @fortawesome/free-regular-svg-icons | 6.5.1   | Includes regular style icons from the Font Awesome library.                                                |
| @fortawesome/free-solid-svg-icons   | 6.5.1   | Includes solid style icons from the Font Awesome library.                                                  |
| @fortawesome/react-fontawesome      | 0.2.0   | React component for Font Awesome, simplifying the use of icons within React applications.                  |
| @testing-library/jest-dom           | 5.17.0  | Extends Jest testing framework with DOM element matchers, facilitating UI tests. Created by default.       |
| @testing-library/react              | 13.4.0  | Facilitates writing unit and integration tests for React components. Created by default.                   |
| @testing-library/user-event         | 13.5.0  | Simulates user events (click, type, etc.) for testing user interactions in components. Created by default. |
| bootstrap                           | 5.3.2   | Framework for building responsive website, providing styling and layout.                                   |
| js-cookie                           | 3.0.5   | A simple, lightweight JavaScript API for handling browser cookies.                                         |
| moment                              | 2.30.1  | Parse, manipulate, and display dates and times in JavaScript.                                              |
| react                               | 18.2.0  | A JavaScript library for building user interfaces. Created by default.                                     |
| react-bootstrap                     | 2.10.0  | Integrates Bootstrap with React, combining the styling of Bootstrap and the components of React.           |
| react-dom                           | 18.2.0  | Serves as the entry point to the DOM and server renderers for React. Created by default.                   |
| react-router-dom                    | 6.22.0  | DOM bindings for React Router, enabling navigation in a web app.                                           |
| react-scripts                       | 5.0.1   | Scripts and configuration used by Create React App. Created by default.                                    |
| react-toastify                      | 10.0.4  | Adds toast notifications to React applications, enhancing user feedback.                                   |
| sass                                | 1.70.0  | Used to customize Bootstrap components and for general styling of the application.                         |
| web-vitals                          | 2.1.4   | Measures web vitals performance metrics to improve user experience. Created by default.                    |

### Backend

| GroupID                          | ArtifactID                       | Version     | Scope    | Purpose                |
| ---------------------------------| -------------------------------  | ------------|----------|------------------------|
| org.springframework.boot         | spring-boot-starter-data-jpa     |             |          | Database Connections   |
| org.springframework.boot         |spring-boot-starter-mail          |             |          | Emails                 |
| org.springframework.boot         | spring-boot-starter-security     |             |          | Security               |
| org.springframework.boot         | spring-security-config           | 6.2.1       |          | Configuration          |
| org.springframework.boot         | spring-boot-starter-validation   |             |          | Starter-Kit-Validation |
| org.springframework.boot         | spring-boot-starter-web          |             |          | Starter-Kit-Web        |
| io.jsonwebtoken                  | jjwt-api                         | 0.11.5      |          | Json Web Token         |
| io.jsonwebtoken                  | jjwt-impl                        | 0.11.5      |          | Json Web Token         |
| io.jsonwebtoken                  | jjwt-jackson                     | 0.11.5      |          | Json Web Token         |
| com.mysql                        | mysql-connector-j                |             | Runtime  | Database Driver        |
| org.projectlombok                | lombok                           |             |          | Pattern Generator      |
| org.springframework.boot         | spring-boot-starter-test         |             | Test     | Test-Framework         |
| org.springframework.security     | spring-security-test             |             | Test     | Test-Framework         |
| com.google.guava                 | guava                            | 33.0.0-jre  |          | Hashing                |
| org.apache.commons               | commons-lang3                    |             |          | Reusable Components    |
| junit                            | junit                            |             | Test     | Test Framework         |
| org.quartz-scheduler             | quartz                           | 2.3.2       |          | Scheduler              |
| com.stripe                       | stripe-java                      | 24.19.0     |          | Payment Gateway        |

## Build and Deploy Instructions

### Build

```
mvn clean package -DskipTests
```

### Test

```
mvn test
```

### Setting up environment

First, we need to set environment variables

Edit `ecocredit_environment_setup.bar` or `eco_credit_environment_setup.sh` and add all the values

Then run the following command:

**Windows:**

```
> bat ecocredit_env_setup.bat
```

**Linux/Mac**

```
$ source ecocredit_env_setup.sh
```

This will set up all the required environment variables

### Running the application directly

```
mvn spring-boot:run
```

### Building and Running the docker container (Optional)

cd to the root directory

```
cd <ecocredit_root_directory>
```

Then build and run the container for backend

```
docker run -it $(docker build \
      --build-arg DATASOURCE_URL_DEV="$DATASOURCE_URL_DEV" \
      --build-arg DATASOURCE_USER_DEV="$DATASOURCE_USER_DEV" \
      --build-arg DATASOURCE_PASSWORD="$DATASOURCE_PASSWORD" \
      --build-arg EXPIRATION_DURATION_IN_MS="$EXPIRATION_DURATION_IN_MS" \
      --build-arg TOKEN_SECRET_KEY="$TOKEN_SECRET_KEY" \
      --build-arg REFRESH_TOKEN_VALIDITY_MS="$REFRESH_TOKEN_VALIDITY_MS" \
      --build-arg EMAIL_USERNAME="$EMAIL_USERNAME" \
      --build-arg EMAIL_PASSWORD="$EMAIL_PASSWORD" \
      --build-arg EMAIL_HOST="$EMAIL_HOST" \
      --build-arg EMAIL_PORT="$EMAIL_PORT" \
      --build-arg MAIL_DEBUG_DEV="$MAIL_DEBUG_DEV" \
      --build-arg FRONTEND_SERVER_URL="$FRONTEND_SERVER_URL" \
      --build-arg STRIPE_PUBLIC_KEY="$STRIPE_PUBLIC_KEY" \
      --build-arg STRIPE_SECRET_KEY="$STRIPE_SECRET_KEY" \
      --build-arg BASE_URL_BACKEND="$BASE_URL_BACKEND" \
      --build-arg BASE_URL_FRONTEND="$BASE_URL_FRONTEND" \
      -q .)
```

Now we have the backend up, we need to set up our front-end

### Frontend

On terminal, go to the frontend directory

`cd frontend/ecocredit`

Installing necessary dependencies:

```
npm ci
```

Building frontend:

```
npm run build
```

Building and running the docker container:

```
docker run -it $(docker build -q .)
```

## Deployment through docker image (backend and frontend)

```
Note: This is assuming you have already logged into docker and have the daemon running
```

pull the docker image:

```
docker pull docker.io/ecocredit/ecocredit-backend:latest

dockerpull docker.io/ecocredit/ecocredit-frontend:latest
```

running docker container on remote server:

```
docker run -d -p 8080:8080 --name ecocredit_backend docker.io/ecocredit/ecocredit-backend:latest

docker run -d -p 3000:3000 --name ecocredit_frontend docker.io/ecocredit/ecocredit-frontend:latest
```

Clean Build:

```
mvn clean package -DskipTests
```

Tests:

```
mvn test
```



## User Scenarios

### [User Authentication](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/1)

#### Signup

The SignUp functionality allows new users to create an account by providing their personal information, including their name, email address, password, and physical address.  
Upon successful account creation, a verification email is sent to the user's provided email address with a confirmation token.

Input from the User:

- Email
- ⁠Password
- First Name
- ⁠Last Name
- ⁠Address (Street, City, Province, Postal Code)

#### Login

The Login functionality allows existing users to log into their accounts.

Input from the User:

- ⁠Email
- ⁠Password

**Forget password**

Allows users to request a password reset. By entering their registered email, they receive a link to securely create a new password.

**Reset password**

Accessed via the received email link, this page prompts users to enter and confirm a new password, effectively updating their account security.

#### Role Selection

Upon successful login, users can select their role Customer or Recycler to be directed to the respective dashboard with tailored functionalities.

### [Homepage](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/19)

#### Customer Dashboard

Upon selecting the customer role, users access the Customer Dashboard. Here, they can schedule waste pickups and track their status.

#### [Pickup Scheduling](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/13)

**Pickup schedule**
This page allows users to arrange waste collection by choosing a date, time, and waste types.  
If the user's EcoCredit balance is insufficient for the service fees, they are redirected to a payment gateway to complete the transaction.

#### [Payment for Pickup Service](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/55)

**Payment for pickup service**
Users enter credit card details to pay for their scheduled pickup service.  
Upon successful payment, the pickup is confirmed, and users are redirected to their Pickup Schedule page.

#### [Pickup Status Tracking](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/14)

**Pickup status**

Users can view the date, time, and current status of their pickups.  
If a pickup is scheduled or in progress, users have the option to cancel it directly through the cancel button provided.

#### Recycler Dashboard

Upon selecting the recycler role, users access the Recycler Dashboard. Here, they can view active bids, participate in bidding, and monitor their bid history.

**Active Bids**

This tab lists ongoing bids. Users can view item details and enter the bidding process.

After selecting a bid, users can either choose to bid at the next suggested increment or enter a custom amount higher than the current bid using their EcoCredits

**View my bids**

Users can track all the bids they've participated in.  
For active bids, the option to place further bids is available, directing users back to the specific bid page for continued engagement.

### [Account Management](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/2)

**Profile page**

Accessible from both customer and recycler dashboards, the Profile Page enables users to manage their personal details, such as name, contact, and address. The page displays the user's EcoCredit balance for quick reference.  
Profile updates trigger on-site notifications and confirmation emails for seamless user experience.

### [Admin](https://git.cs.dal.ca/courses/2024-winter/csci5308/Group01/-/issues/16)

#### Admin Dashboard

EcoCredit has one admin account. When an admin logs in, they are redirected to their dashboard, which allows them to do the following:

**View scheduled pickups**

This page shows all pickups that have been scheduled by users, sorted from the latest pickup.

The pickup information contains:
- pickup date
- pickup time
- first and last name of user who scheduled the pickup
- list of waste items: ID, category, and weight (kg)

**View pickups in progress**

This page shows all pickups that are in progress, sorted from the latest pickup.

**View completed pickups**

This page shows all pickups that are completed, sorted from the latest pickup.

**Update the weight of a waste item in a pickup**

An admin can enter the waste item's ID and its weight in kilograms.  
After clicking on 'update', the weight of the item is reflected in the completed pickups table.

**Create a bid**

An admin can create a bid of a waste item.  
To do this, the admin needs to enter the waste item's ID and the date and time of the bid.

**View bids**

An admin can view all bids, both active and inactive. Each bid contains the following information:

- waste item's ID
- waste item's category
- waste item's weight (kg)
- base price ($)
- top bid amount ($)
- winner of the bid
- date and time of the bid
- bid status: active or inactive
- payment status: paid or not paid

**View active bids**

An admin can view all active bids.

## References

| Topic                      | URL                                                                                       |
| -------------------------- | ----------------------------------------------------------------------------------------- |
| Forgot Password Flow       | https://supertokens.com/blog/implementing-a-forgot-password-flow                          |
| Forgot Password Psuedocode | https://stackoverflow.com/questions/1102781/best-way-for-a-forgot-password-implementation |
| React Bootstrap            | https://react-bootstrap.netlify.app/docs/getting-started/introduction                     |
| Bootstrap                  | https://getbootstrap.com/docs/5.3/getting-started/introduction/                           |
| Submit Form Data to API    | https://www.techomoro.com/submit-a-form-data-to-rest-api-in-a-react-app/                  |
| Display Duration           | https://momentjs.com/docs/#/durations/                                                    |
